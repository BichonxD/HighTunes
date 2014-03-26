
package hightunes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hightunes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ViderPanierResponse_QNAME = new QName("http://HighTunes/", "viderPanierResponse");
    private final static QName _SuppressionArticle_QNAME = new QName("http://HighTunes/", "suppressionArticle");
    private final static QName _CatalogueToStringResponse_QNAME = new QName("http://HighTunes/", "catalogueToStringResponse");
    private final static QName _AddToPanierResponse_QNAME = new QName("http://HighTunes/", "addToPanierResponse");
    private final static QName _ArticleInexistant_QNAME = new QName("http://HighTunes/", "ArticleInexistant");
    private final static QName _SetListePaniers_QNAME = new QName("http://HighTunes/", "setListePaniers");
    private final static QName _Connexion_QNAME = new QName("http://HighTunes/", "connexion");
    private final static QName _AddToPanier_QNAME = new QName("http://HighTunes/", "addToPanier");
    private final static QName _ConnexionResponse_QNAME = new QName("http://HighTunes/", "connexionResponse");
    private final static QName _GetCatResponse_QNAME = new QName("http://HighTunes/", "getCatResponse");
    private final static QName _ViderPanier_QNAME = new QName("http://HighTunes/", "viderPanier");
    private final static QName _CalculCoutPanier_QNAME = new QName("http://HighTunes/", "calculCoutPanier");
    private final static QName _DeconnexionResponse_QNAME = new QName("http://HighTunes/", "deconnexionResponse");
    private final static QName _Deconnexion_QNAME = new QName("http://HighTunes/", "deconnexion");
    private final static QName _ToStringResponse_QNAME = new QName("http://HighTunes/", "toStringResponse");
    private final static QName _ErreurPanier_QNAME = new QName("http://HighTunes/", "ErreurPanier");
    private final static QName _GetNbTotalArticleResponse_QNAME = new QName("http://HighTunes/", "getNbTotalArticleResponse");
    private final static QName _CatalogueToString_QNAME = new QName("http://HighTunes/", "catalogueToString");
    private final static QName _PanierToString_QNAME = new QName("http://HighTunes/", "panierToString");
    private final static QName _GetCat_QNAME = new QName("http://HighTunes/", "getCat");
    private final static QName _ModifierQuantiteResponse_QNAME = new QName("http://HighTunes/", "modifierQuantiteResponse");
    private final static QName _GetNbTotalArticle_QNAME = new QName("http://HighTunes/", "getNbTotalArticle");
    private final static QName _Commander_QNAME = new QName("http://HighTunes/", "commander");
    private final static QName _CalculCoutPanierResponse_QNAME = new QName("http://HighTunes/", "calculCoutPanierResponse");
    private final static QName _PanierToStringResponse_QNAME = new QName("http://HighTunes/", "panierToStringResponse");
    private final static QName _SetCat_QNAME = new QName("http://HighTunes/", "setCat");
    private final static QName _SetListePaniersResponse_QNAME = new QName("http://HighTunes/", "setListePaniersResponse");
    private final static QName _ToString_QNAME = new QName("http://HighTunes/", "toString");
    private final static QName _CommanderResponse_QNAME = new QName("http://HighTunes/", "commanderResponse");
    private final static QName _ModifierQuantite_QNAME = new QName("http://HighTunes/", "modifierQuantite");
    private final static QName _GetListePaniersResponse_QNAME = new QName("http://HighTunes/", "getListePaniersResponse");
    private final static QName _GetListePaniers_QNAME = new QName("http://HighTunes/", "getListePaniers");
    private final static QName _GetArticleResponse_QNAME = new QName("http://HighTunes/", "getArticleResponse");
    private final static QName _SetCatResponse_QNAME = new QName("http://HighTunes/", "setCatResponse");
    private final static QName _SuppressionArticleResponse_QNAME = new QName("http://HighTunes/", "suppressionArticleResponse");
    private final static QName _GetArticle_QNAME = new QName("http://HighTunes/", "getArticle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hightunes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListePaniers }
     * 
     */
    public GetListePaniers createGetListePaniers() {
        return new GetListePaniers();
    }

    /**
     * Create an instance of {@link ConnexionResponse }
     * 
     */
    public ConnexionResponse createConnexionResponse() {
        return new ConnexionResponse();
    }

    /**
     * Create an instance of {@link Commander }
     * 
     */
    public Commander createCommander() {
        return new Commander();
    }

    /**
     * Create an instance of {@link SetCatResponse }
     * 
     */
    public SetCatResponse createSetCatResponse() {
        return new SetCatResponse();
    }

    /**
     * Create an instance of {@link Catalogue.ListeArticle.Entry }
     * 
     */
    public Catalogue.ListeArticle.Entry createCatalogueListeArticleEntry() {
        return new Catalogue.ListeArticle.Entry();
    }

    /**
     * Create an instance of {@link ToStringResponse }
     * 
     */
    public ToStringResponse createToStringResponse() {
        return new ToStringResponse();
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link SetListePaniersResponse }
     * 
     */
    public SetListePaniersResponse createSetListePaniersResponse() {
        return new SetListePaniersResponse();
    }

    /**
     * Create an instance of {@link GetListePaniersResponse }
     * 
     */
    public GetListePaniersResponse createGetListePaniersResponse() {
        return new GetListePaniersResponse();
    }

    /**
     * Create an instance of {@link GetNbTotalArticle }
     * 
     */
    public GetNbTotalArticle createGetNbTotalArticle() {
        return new GetNbTotalArticle();
    }

    /**
     * Create an instance of {@link Deconnexion }
     * 
     */
    public Deconnexion createDeconnexion() {
        return new Deconnexion();
    }

    /**
     * Create an instance of {@link GetArticle }
     * 
     */
    public GetArticle createGetArticle() {
        return new GetArticle();
    }

    /**
     * Create an instance of {@link SuppressionArticle }
     * 
     */
    public SuppressionArticle createSuppressionArticle() {
        return new SuppressionArticle();
    }

    /**
     * Create an instance of {@link CatalogueToStringResponse }
     * 
     */
    public CatalogueToStringResponse createCatalogueToStringResponse() {
        return new CatalogueToStringResponse();
    }

    /**
     * Create an instance of {@link PanierToString }
     * 
     */
    public PanierToString createPanierToString() {
        return new PanierToString();
    }

    /**
     * Create an instance of {@link GetNbTotalArticleResponse }
     * 
     */
    public GetNbTotalArticleResponse createGetNbTotalArticleResponse() {
        return new GetNbTotalArticleResponse();
    }

    /**
     * Create an instance of {@link ModifierQuantiteResponse }
     * 
     */
    public ModifierQuantiteResponse createModifierQuantiteResponse() {
        return new ModifierQuantiteResponse();
    }

    /**
     * Create an instance of {@link Catalogue.ListeArticle }
     * 
     */
    public Catalogue.ListeArticle createCatalogueListeArticle() {
        return new Catalogue.ListeArticle();
    }

    /**
     * Create an instance of {@link ArticleInexistant }
     * 
     */
    public ArticleInexistant createArticleInexistant() {
        return new ArticleInexistant();
    }

    /**
     * Create an instance of {@link CalculCoutPanier }
     * 
     */
    public CalculCoutPanier createCalculCoutPanier() {
        return new CalculCoutPanier();
    }

    /**
     * Create an instance of {@link CommanderResponse }
     * 
     */
    public CommanderResponse createCommanderResponse() {
        return new CommanderResponse();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link Connexion }
     * 
     */
    public Connexion createConnexion() {
        return new Connexion();
    }

    /**
     * Create an instance of {@link ErreurPanier }
     * 
     */
    public ErreurPanier createErreurPanier() {
        return new ErreurPanier();
    }

    /**
     * Create an instance of {@link ModifierQuantite }
     * 
     */
    public ModifierQuantite createModifierQuantite() {
        return new ModifierQuantite();
    }

    /**
     * Create an instance of {@link CatalogueToString }
     * 
     */
    public CatalogueToString createCatalogueToString() {
        return new CatalogueToString();
    }

    /**
     * Create an instance of {@link ViderPanier }
     * 
     */
    public ViderPanier createViderPanier() {
        return new ViderPanier();
    }

    /**
     * Create an instance of {@link AddToPanierResponse }
     * 
     */
    public AddToPanierResponse createAddToPanierResponse() {
        return new AddToPanierResponse();
    }

    /**
     * Create an instance of {@link GetCatResponse }
     * 
     */
    public GetCatResponse createGetCatResponse() {
        return new GetCatResponse();
    }

    /**
     * Create an instance of {@link CalculCoutPanierResponse }
     * 
     */
    public CalculCoutPanierResponse createCalculCoutPanierResponse() {
        return new CalculCoutPanierResponse();
    }

    /**
     * Create an instance of {@link GetArticleResponse }
     * 
     */
    public GetArticleResponse createGetArticleResponse() {
        return new GetArticleResponse();
    }

    /**
     * Create an instance of {@link ViderPanierResponse }
     * 
     */
    public ViderPanierResponse createViderPanierResponse() {
        return new ViderPanierResponse();
    }

    /**
     * Create an instance of {@link ToString }
     * 
     */
    public ToString createToString() {
        return new ToString();
    }

    /**
     * Create an instance of {@link SetListePaniers }
     * 
     */
    public SetListePaniers createSetListePaniers() {
        return new SetListePaniers();
    }

    /**
     * Create an instance of {@link GetCat }
     * 
     */
    public GetCat createGetCat() {
        return new GetCat();
    }

    /**
     * Create an instance of {@link SetCat }
     * 
     */
    public SetCat createSetCat() {
        return new SetCat();
    }

    /**
     * Create an instance of {@link SuppressionArticleResponse }
     * 
     */
    public SuppressionArticleResponse createSuppressionArticleResponse() {
        return new SuppressionArticleResponse();
    }

    /**
     * Create an instance of {@link PanierToStringResponse }
     * 
     */
    public PanierToStringResponse createPanierToStringResponse() {
        return new PanierToStringResponse();
    }

    /**
     * Create an instance of {@link Catalogue }
     * 
     */
    public Catalogue createCatalogue() {
        return new Catalogue();
    }

    /**
     * Create an instance of {@link DeconnexionResponse }
     * 
     */
    public DeconnexionResponse createDeconnexionResponse() {
        return new DeconnexionResponse();
    }

    /**
     * Create an instance of {@link AddToPanier }
     * 
     */
    public AddToPanier createAddToPanier() {
        return new AddToPanier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViderPanierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "viderPanierResponse")
    public JAXBElement<ViderPanierResponse> createViderPanierResponse(ViderPanierResponse value) {
        return new JAXBElement<ViderPanierResponse>(_ViderPanierResponse_QNAME, ViderPanierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuppressionArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "suppressionArticle")
    public JAXBElement<SuppressionArticle> createSuppressionArticle(SuppressionArticle value) {
        return new JAXBElement<SuppressionArticle>(_SuppressionArticle_QNAME, SuppressionArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "catalogueToStringResponse")
    public JAXBElement<CatalogueToStringResponse> createCatalogueToStringResponse(CatalogueToStringResponse value) {
        return new JAXBElement<CatalogueToStringResponse>(_CatalogueToStringResponse_QNAME, CatalogueToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToPanierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "addToPanierResponse")
    public JAXBElement<AddToPanierResponse> createAddToPanierResponse(AddToPanierResponse value) {
        return new JAXBElement<AddToPanierResponse>(_AddToPanierResponse_QNAME, AddToPanierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleInexistant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "ArticleInexistant")
    public JAXBElement<ArticleInexistant> createArticleInexistant(ArticleInexistant value) {
        return new JAXBElement<ArticleInexistant>(_ArticleInexistant_QNAME, ArticleInexistant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListePaniers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "setListePaniers")
    public JAXBElement<SetListePaniers> createSetListePaniers(SetListePaniers value) {
        return new JAXBElement<SetListePaniers>(_SetListePaniers_QNAME, SetListePaniers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Connexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "connexion")
    public JAXBElement<Connexion> createConnexion(Connexion value) {
        return new JAXBElement<Connexion>(_Connexion_QNAME, Connexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddToPanier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "addToPanier")
    public JAXBElement<AddToPanier> createAddToPanier(AddToPanier value) {
        return new JAXBElement<AddToPanier>(_AddToPanier_QNAME, AddToPanier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "connexionResponse")
    public JAXBElement<ConnexionResponse> createConnexionResponse(ConnexionResponse value) {
        return new JAXBElement<ConnexionResponse>(_ConnexionResponse_QNAME, ConnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getCatResponse")
    public JAXBElement<GetCatResponse> createGetCatResponse(GetCatResponse value) {
        return new JAXBElement<GetCatResponse>(_GetCatResponse_QNAME, GetCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViderPanier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "viderPanier")
    public JAXBElement<ViderPanier> createViderPanier(ViderPanier value) {
        return new JAXBElement<ViderPanier>(_ViderPanier_QNAME, ViderPanier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculCoutPanier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "calculCoutPanier")
    public JAXBElement<CalculCoutPanier> createCalculCoutPanier(CalculCoutPanier value) {
        return new JAXBElement<CalculCoutPanier>(_CalculCoutPanier_QNAME, CalculCoutPanier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeconnexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "deconnexionResponse")
    public JAXBElement<DeconnexionResponse> createDeconnexionResponse(DeconnexionResponse value) {
        return new JAXBElement<DeconnexionResponse>(_DeconnexionResponse_QNAME, DeconnexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deconnexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "deconnexion")
    public JAXBElement<Deconnexion> createDeconnexion(Deconnexion value) {
        return new JAXBElement<Deconnexion>(_Deconnexion_QNAME, Deconnexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "toStringResponse")
    public JAXBElement<ToStringResponse> createToStringResponse(ToStringResponse value) {
        return new JAXBElement<ToStringResponse>(_ToStringResponse_QNAME, ToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreurPanier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "ErreurPanier")
    public JAXBElement<ErreurPanier> createErreurPanier(ErreurPanier value) {
        return new JAXBElement<ErreurPanier>(_ErreurPanier_QNAME, ErreurPanier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNbTotalArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getNbTotalArticleResponse")
    public JAXBElement<GetNbTotalArticleResponse> createGetNbTotalArticleResponse(GetNbTotalArticleResponse value) {
        return new JAXBElement<GetNbTotalArticleResponse>(_GetNbTotalArticleResponse_QNAME, GetNbTotalArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "catalogueToString")
    public JAXBElement<CatalogueToString> createCatalogueToString(CatalogueToString value) {
        return new JAXBElement<CatalogueToString>(_CatalogueToString_QNAME, CatalogueToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanierToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "panierToString")
    public JAXBElement<PanierToString> createPanierToString(PanierToString value) {
        return new JAXBElement<PanierToString>(_PanierToString_QNAME, PanierToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getCat")
    public JAXBElement<GetCat> createGetCat(GetCat value) {
        return new JAXBElement<GetCat>(_GetCat_QNAME, GetCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierQuantiteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "modifierQuantiteResponse")
    public JAXBElement<ModifierQuantiteResponse> createModifierQuantiteResponse(ModifierQuantiteResponse value) {
        return new JAXBElement<ModifierQuantiteResponse>(_ModifierQuantiteResponse_QNAME, ModifierQuantiteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNbTotalArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getNbTotalArticle")
    public JAXBElement<GetNbTotalArticle> createGetNbTotalArticle(GetNbTotalArticle value) {
        return new JAXBElement<GetNbTotalArticle>(_GetNbTotalArticle_QNAME, GetNbTotalArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Commander }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "commander")
    public JAXBElement<Commander> createCommander(Commander value) {
        return new JAXBElement<Commander>(_Commander_QNAME, Commander.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculCoutPanierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "calculCoutPanierResponse")
    public JAXBElement<CalculCoutPanierResponse> createCalculCoutPanierResponse(CalculCoutPanierResponse value) {
        return new JAXBElement<CalculCoutPanierResponse>(_CalculCoutPanierResponse_QNAME, CalculCoutPanierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanierToStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "panierToStringResponse")
    public JAXBElement<PanierToStringResponse> createPanierToStringResponse(PanierToStringResponse value) {
        return new JAXBElement<PanierToStringResponse>(_PanierToStringResponse_QNAME, PanierToStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "setCat")
    public JAXBElement<SetCat> createSetCat(SetCat value) {
        return new JAXBElement<SetCat>(_SetCat_QNAME, SetCat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListePaniersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "setListePaniersResponse")
    public JAXBElement<SetListePaniersResponse> createSetListePaniersResponse(SetListePaniersResponse value) {
        return new JAXBElement<SetListePaniersResponse>(_SetListePaniersResponse_QNAME, SetListePaniersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "toString")
    public JAXBElement<ToString> createToString(ToString value) {
        return new JAXBElement<ToString>(_ToString_QNAME, ToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommanderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "commanderResponse")
    public JAXBElement<CommanderResponse> createCommanderResponse(CommanderResponse value) {
        return new JAXBElement<CommanderResponse>(_CommanderResponse_QNAME, CommanderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierQuantite }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "modifierQuantite")
    public JAXBElement<ModifierQuantite> createModifierQuantite(ModifierQuantite value) {
        return new JAXBElement<ModifierQuantite>(_ModifierQuantite_QNAME, ModifierQuantite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListePaniersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getListePaniersResponse")
    public JAXBElement<GetListePaniersResponse> createGetListePaniersResponse(GetListePaniersResponse value) {
        return new JAXBElement<GetListePaniersResponse>(_GetListePaniersResponse_QNAME, GetListePaniersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListePaniers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getListePaniers")
    public JAXBElement<GetListePaniers> createGetListePaniers(GetListePaniers value) {
        return new JAXBElement<GetListePaniers>(_GetListePaniers_QNAME, GetListePaniers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getArticleResponse")
    public JAXBElement<GetArticleResponse> createGetArticleResponse(GetArticleResponse value) {
        return new JAXBElement<GetArticleResponse>(_GetArticleResponse_QNAME, GetArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "setCatResponse")
    public JAXBElement<SetCatResponse> createSetCatResponse(SetCatResponse value) {
        return new JAXBElement<SetCatResponse>(_SetCatResponse_QNAME, SetCatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuppressionArticleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "suppressionArticleResponse")
    public JAXBElement<SuppressionArticleResponse> createSuppressionArticleResponse(SuppressionArticleResponse value) {
        return new JAXBElement<SuppressionArticleResponse>(_SuppressionArticleResponse_QNAME, SuppressionArticleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://HighTunes/", name = "getArticle")
    public JAXBElement<GetArticle> createGetArticle(GetArticle value) {
        return new JAXBElement<GetArticle>(_GetArticle_QNAME, GetArticle.class, null, value);
    }

}
