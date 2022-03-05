
public class Product {
	
	private int product_id, category_id, price, video_memory, ssd_capacity, ram_memory, weight;
	private String disponibility, name, brand, cpu, gpu, storage_type, display_resolution;
	
	public Product(int product_id, int category_id, int price, String disponibility, String name, String brand, String cpu, String gpu, int video_memory, String storage_type, int ssd_capacity, int ram_memory, int weight, String display_resolution) {
		//super();
		this.product_id = product_id;
		this.category_id = category_id;
		this.price = price;
		this.video_memory = video_memory;
		this.ssd_capacity = ssd_capacity;
		this.ram_memory = ram_memory;
		this.weight = weight;
		this.disponibility = disponibility;
		this.name = name;
		this.brand = brand;
		this.cpu = cpu;
		this.gpu = gpu;
		this.storage_type = storage_type;
		this.display_resolution = display_resolution;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getVideo_memory() {
		return video_memory;
	}

	public void setVideo_memory(int video_memory) {
		this.video_memory = video_memory;
	}

	public int getSsd_capacity() {
		return ssd_capacity;
	}

	public void setSsd_capacity(int ssd_capacity) {
		this.ssd_capacity = ssd_capacity;
	}

	public int getRam_memory() {
		return ram_memory;
	}

	public void setRam_memory(int ram_memory) {
		this.ram_memory = ram_memory;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getDisponibility() {
		return disponibility;
	}

	public void setDisponibility(String disponibility) {
		this.disponibility = disponibility;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getStorage_type() {
		return storage_type;
	}

	public void setStorage_type(String storage_type) {
		this.storage_type = storage_type;
	}

	public String getDisplay_resolution() {
		return display_resolution;
	}

	public void setDisplay_resolution(String display_resolution) {
		this.display_resolution = display_resolution;
	}
	
}
