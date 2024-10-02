package group5.webapp.FinalProjectOOP.models;

import javax.persistence.*;

@Entity
@Table(name="ProductImage")
public class ProductImage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String link;
	
	public ProductImage() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	@ManyToOne
	@JoinColumn(name="product_id")
    private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
