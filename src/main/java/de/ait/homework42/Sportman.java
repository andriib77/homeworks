package de.ait.homework42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sportman {
    private String name;
    private int age;
    private String sport;
    private int records;
    private static final Logger LOGGER = LoggerFactory.getLogger(Sportman.class);

    public Sportman(String name, int age, String sport, int records) {
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Sportman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sport='" + sport + '\'' +
                ", records=" + records +
                '}';
    }
    public boolean updateRecord (int newRecord){
        if(newRecord > records){
            setRecords(newRecord);
            LOGGER.info("Новый рекорд установлен: {} --> {}", getName(), newRecord);
            return true;
        }else{
            LOGGER.info("Попытка уставить новый рекорд {} не получилось. ({})", getName(), getRecords());
            return false;
        }
    }
    public boolean isEligibleForCompetition(int minAge, int maxAge) {
        if (age >= minAge && age <= maxAge) {
            LOGGER.info("Возраст соответствует для участия соревнования {}", getName());
            return true;
        } else {
            LOGGER.error("Не соответствует для участия в соревнованиях {}", getName());
            return false;
        }
    }

}
