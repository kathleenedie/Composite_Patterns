package se.composite;

public class ProgressReport {
	
	StringBuffer stringBuffer = new StringBuffer();

	public void addProgress(Employee employee, int i, String milestone) {
		this.addMilestone(milestone);
	}

	private void addMilestone(String milestone) {
		this.stringBuffer.append(milestone);
	}
	
	public String toString()
    {
        return stringBuffer.toString();
    }
}
