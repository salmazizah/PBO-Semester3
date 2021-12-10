package collection;

public class ServicePackage {
    private String service;
    private long value;
    
    public ServicePackage(String service, long value) {
		this.service = service;
		this.value = value;
	}
    
	public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
