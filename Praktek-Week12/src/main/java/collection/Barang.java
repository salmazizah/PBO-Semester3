package collection;

public class Barang {
	private Status status;
    private ServicePackage servicePackage;
    private City city;
    private int weight;
    private int quantity;
    private long priceItem;
    private String productName;

    public Barang(int code, String desc, String service, long value, 
			String origin, String destination, int weight, int quantity, long priceItem, String product) 
	{
		status = new Status(code, desc);
		servicePackage = new ServicePackage(service, value);
		city = new City(origin, destination);
		this.weight = weight;
		this.priceItem = priceItem;
		this.quantity = quantity;
		this.productName = product;
	}

    public Status getStatus() 
	{
		return status;
	}

	public ServicePackage getSp() 
	{
		return servicePackage;
	}

	public City getCity() 
	{
		return city;
	}

	public int getWeight() 
	{
		return weight;
	}

	public long getPriceItem() 
	{
		return priceItem;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public String getProductName() 
	{
		return productName;
	}

    @Override
    public String toString() {
        return "Barang{"+productName+" | "+quantity+" | "+weight+" | "+
                city.getDestination()+" | "+servicePackage.getService()+" | "+
                servicePackage.getValue()+" | "+((priceItem*quantity)+servicePackage.getValue());
    }
}
