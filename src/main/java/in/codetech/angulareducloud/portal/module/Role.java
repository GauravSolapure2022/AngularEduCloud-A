package in.codetech.angulareducloud.portal.module;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	private String roleName;


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "role")
	private Set<UserRole> userRoles = new HashSet<>();



	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(long roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + "]";
	}


}
