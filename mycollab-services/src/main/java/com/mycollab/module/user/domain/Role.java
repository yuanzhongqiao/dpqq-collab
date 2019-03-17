/*Domain class of table s_roles*/
package com.mycollab.module.user.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_roles")
@Alias("Role")
public class Role extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.id
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.rolename
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("rolename")
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.description
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @Length(max=45, message="Field value is too long")
    @Column("description")
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.sAccountId
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @NotNull
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.isSystemRole
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @Column("isSystemRole")
    private Boolean issystemrole;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.isDefault
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @Column("isDefault")
    private Boolean isdefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.createdTime
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @Column("createdTime")
    private LocalDateTime createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.lastUpdatedTime
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    @Column("lastUpdatedTime")
    private LocalDateTime lastupdatedtime;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Role item = (Role)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1905, 1669).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.id
     *
     * @return the value of s_roles.id
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.id
     *
     * @param id the value for s_roles.id
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.rolename
     *
     * @return the value of s_roles.rolename
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withRolename(String rolename) {
        this.setRolename(rolename);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.rolename
     *
     * @param rolename the value for s_roles.rolename
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.description
     *
     * @return the value of s_roles.description
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.description
     *
     * @param description the value for s_roles.description
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.sAccountId
     *
     * @return the value of s_roles.sAccountId
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withSaccountid(Integer saccountid) {
        this.setSaccountid(saccountid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.sAccountId
     *
     * @param saccountid the value for s_roles.sAccountId
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.isSystemRole
     *
     * @return the value of s_roles.isSystemRole
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Boolean getIssystemrole() {
        return issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withIssystemrole(Boolean issystemrole) {
        this.setIssystemrole(issystemrole);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.isSystemRole
     *
     * @param issystemrole the value for s_roles.isSystemRole
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setIssystemrole(Boolean issystemrole) {
        this.issystemrole = issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.isDefault
     *
     * @return the value of s_roles.isDefault
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Boolean getIsdefault() {
        return isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withIsdefault(Boolean isdefault) {
        this.setIsdefault(isdefault);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.isDefault
     *
     * @param isdefault the value for s_roles.isDefault
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setIsdefault(Boolean isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.createdTime
     *
     * @return the value of s_roles.createdTime
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public LocalDateTime getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withCreatedtime(LocalDateTime createdtime) {
        this.setCreatedtime(createdtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.createdTime
     *
     * @param createdtime the value for s_roles.createdTime
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setCreatedtime(LocalDateTime createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.lastUpdatedTime
     *
     * @return the value of s_roles.lastUpdatedTime
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public LocalDateTime getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public Role withLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.setLastupdatedtime(lastupdatedtime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.lastUpdatedTime
     *
     * @param lastupdatedtime the value for s_roles.lastUpdatedTime
     *
     * @mbg.generated Sat Mar 16 20:37:45 CDT 2019
     */
    public void setLastupdatedtime(LocalDateTime lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public enum Field {
        id,
        rolename,
        description,
        saccountid,
        issystemrole,
        isdefault,
        createdtime,
        lastupdatedtime;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}