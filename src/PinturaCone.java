import java.lang.Math;

public class PinturaCone {
	
	private double z;
	private double r;
	private int escolhaTinta;
	
	public PinturaCone(double z, double r, int escolhaTinta) {
		setZ(z);
		setR(r);
		setEscolhaTinta(escolhaTinta);
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		if (z > 0)
			this.z = z;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		if (r > 0)
			this.r = r;
	}

	public int getEscolhaTinta() {
		return escolhaTinta;
	}

	public void setEscolhaTinta(int escolhaTinta) {
		if ((escolhaTinta >= 1) && (escolhaTinta <= 3))
			this.escolhaTinta = escolhaTinta;
	}
	
	public double geratriz() {
		return Math.sqrt((r*r) + (z*z));
	}
	
	public double areaFundo() {
		return Math.PI * (r * r);
	}
	
	public double areaLateral() {
		return Math.PI * r * geratriz();
	}
	
	public double areaTotal() {
		return (Math.PI * r) * (r + geratriz());
	}
	
	public double litrosTotal() {
		return ((areaFundo() + areaLateral() + areaTotal()) / 2 ) * 3.45;
	}
	
	public double latasTotal() {
		return Math.ceil(litrosTotal() / 18);
	}
	
	private double preco() {
		
		if (escolhaTinta == 1)
			return 238.90;
		else if (escolhaTinta == 2)
			return 467.98;
		else
			return 758.34;
	}
	
	public double precoTotal() {
		return preco() * latasTotal();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PinturaCone [getZ()=");
		builder.append(getZ());
		builder.append(", getR()=");
		builder.append(getR());
		builder.append(", getEscolhaTinta()=");
		builder.append(getEscolhaTinta());
		builder.append(", geratriz()=");
		builder.append(geratriz());
		builder.append(", areaFundo()=");
		builder.append(areaFundo());
		builder.append(", areaLateral()=");
		builder.append(areaLateral());
		builder.append(", areaTotal()=");
		builder.append(areaTotal());
		builder.append(", litrosTotal()=");
		builder.append(litrosTotal());
		builder.append(", latasTotal()=");
		builder.append(latasTotal());
		builder.append(", precoTotal()=");
		builder.append(precoTotal());
		builder.append("]");
		return builder.toString();
	}
	
}