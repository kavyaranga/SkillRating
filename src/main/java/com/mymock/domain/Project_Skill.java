package com.mymock.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rkavya on 4/10/2015.
 */
@Entity
@Table(name = "Project_Skill")
@AssociationOverrides({
        @AssociationOverride(name = "primaryKey.employee",
                joinColumns = @JoinColumn(name = "employee_id")),
        @AssociationOverride(name = "primaryKey.project",
                joinColumns = @JoinColumn(name = "proj_id")),
        @AssociationOverride(name = "primaryKey.technology",
                joinColumns = @JoinColumn(name = "tech_id")) })
public class Project_Skill {

    private ProjectSkillId projectSkillId = new ProjectSkillId();

    private int skill_level;

    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_MODIFIED")
    private Date last_modified;

    public int getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(int skill_level) {
        this.skill_level = skill_level;
    }

    public Date getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(Date last_modified) {
        this.last_modified = last_modified;
    }

    public ProjectSkillId getProjectSkillId() {
        return projectSkillId;
    }

    public void setProjectSkillId(ProjectSkillId projectSkillId) {
        this.projectSkillId = projectSkillId;
    }

    @Transient
    public Employee getEmployee(){
        return getProjectSkillId().getEmployee();
    }

    public void setEmployee(Employee employee){

        getProjectSkillId().setEmployee(employee);
    }

    @Transient
    public Project getProject(){
        return getProjectSkillId().getProject();
    }

    public void setProject(Project project){

        getProjectSkillId().setProject(project);
    }

    @Transient
    public Technology getTechnology(){
        return getProjectSkillId().getTechnology();
    }

    public void setTechnology(Technology technology){

        getProjectSkillId().setTechnology(technology);
    }

/*@Transient
    public User getUser() {
        return getPrimaryKey().getUser();
    }

    public void setUser(User user) {
        getPrimaryKey().setUser(user);
    }

    @Transient
    public Group getGroup() {
        return getPrimaryKey().getGroup();
    }

    public void setGroup(Group group) {
        getPrimaryKey().setGroup(group);
    }
this user is obtained from the database with ID 40
User user = (User) session.get(User.class, new Long(40));

 this group is obtained from the database with ID 26
Group group = (Group) session.get(Group.class, new Long(26));

UserGroup userGroup = new UserGroup();
userGroup.setGroup(group);
userGroup.setUser(user);
userGroup.setActivated(true);
userGroup.setRegisteredDate(new Date());

session.save(userGroup);
    */

}
