package org.example.builder;

/**
 * Класс RPG персонажа, реализующий паттерн строитель.
 * Не потокобезопасен(поля не final).
 * Не может быть фабрикой, т.к. повторный build() вернёт уже существующий объект.
 * @autor Трофимук Глеб
 */
public class Character {
    private String name;
    private Integer level;
    private Integer maxHP;
    private String profession;
    private String state;
    private Character(){}
    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public String getProfession() {
        return profession;
    }

    public String getState() {
        return state;
    }
    /**
     * Создаёт объкт класса, через который создается и вовзращается объект сторителя
     * @return Объект строителя
     */
    public static Builder builder(){
        return new Character().new Builder();
    }
    /**
     * Внутренний класс Строитель.
     * Доспуп к сетерам основоного класса проходит через него.
     * Позволяет получить объект основного класса
     */
    public class Builder{
        private  Builder(){}

        public Builder setName(String name) {
            Character.this.name = name;
            return this;
        }

        public Builder setLevel(Integer level) {
            Character.this.level = level;
            return this;
        }

        public Builder setMaxHP(Integer maxHP) {
            Character.this.maxHP = maxHP;
            return this;
        }

        public Builder setProfession(String profession) {
            Character.this.profession = profession;
            return this;
        }

        public Builder setState(String state) {
            Character.this.state = state;
            return this;
        }
        /**
         * @return Объект основного класса
         */
        public Character build(){
            return Character.this;
        }
    }
}
