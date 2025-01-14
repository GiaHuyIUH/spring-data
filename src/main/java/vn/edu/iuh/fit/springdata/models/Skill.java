package vn.edu.iuh.fit.springdata.models;


public class Skill {
    private int id;
    private String skillName;
    private String description;
    private String field;

    public Skill() {
    }

    public Skill(int id, String skillName, String description, String field) {
        this.id = id;
        this.skillName = skillName;
        this.description = description;
        this.field = field;
    }

    public Skill(String skillName, String description, String field) {
        this.skillName = skillName;
        this.description = description;
        this.field = field;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
