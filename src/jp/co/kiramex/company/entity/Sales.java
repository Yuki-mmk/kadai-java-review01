package jp.co.kiramex.company.entity;

public class Sales extends Employee {

	private String appointment;

	public Sales() {

	}

	public Sales(int employeeId, String employeeName, int vitality) {
		super.setEmployeeId(employeeId);
		super.setEmployeeName(employeeName);
		super.setDivisionName("営業部");
		super.setVitality(vitality);
		this.appointment = "未定";
	}

	public void report() {
		super.setVitality(super.getVitality() - 10);
		System.out.println("今日は10件アポイントメント取りました");
	}

	public String getAppointment() {
		return appointment;
	}

	public void setAppointment(String appointment) {
		this.appointment = appointment;
	}
}

