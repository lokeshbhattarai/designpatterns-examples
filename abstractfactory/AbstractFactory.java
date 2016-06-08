package abstractfactory;

public interface AbstractFactory {

	public GiftPack createGiftPack(GiftPackType giftPacktype);
	public Packaging createPackaging(GiftPackType giftPackType,PackagingType packagingType);
}
