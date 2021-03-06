package model;

import java.util.ArrayList;
import java.util.Date;

public class Producto {
	private int idProducto;
	private int idCompra;
	private String nombrePro;
	private int stock;
	private float precioUnidad;
	private float precioTotal;
	private Date fechaCaducidad;
	private Date fechaCompra;
	private ArrayList<Producto> listCompra = new ArrayList<Producto>();
	private ArrayList<Producto> listProductos = new ArrayList<Producto>();


	// Constructora que muestra todos los atributos de producto
	public Producto( int idProducto, String nombrePro, float precioUnidad, Date fechaCaducidad, int stock) {
		this.idProducto = idProducto;
		this.nombrePro = nombrePro;
		this.stock = stock;
		this.precioUnidad = precioUnidad;
		this.fechaCaducidad = fechaCaducidad;
	}
	
	//Constructora para a�adir productos
	public Producto(String nombrePro, float precioUnidad, Date fechaCaducidad, int stock) {
		this.nombrePro = nombrePro;
		this.stock = stock;
		this.precioUnidad = precioUnidad;
		this.fechaCaducidad = fechaCaducidad;
	}
		
	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombrePro() {
		return nombrePro;
	}

	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	// Mostrar lista de compra
	@Override
	public String toString() {
		return "ID "+idProducto + " || Nombre: " + nombrePro;
	}

	// Comprobar que no se inserten productos con mismo ID y nombre
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Producto) {
			Producto prod = (Producto) obj;
			if (idProducto == prod.getIdProducto() && nombrePro.equals(prod.getNombrePro())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
