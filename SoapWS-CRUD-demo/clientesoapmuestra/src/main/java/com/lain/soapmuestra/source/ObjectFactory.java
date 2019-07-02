
package com.lain.soapmuestra.source;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lain.soapmuestra.source package. 
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

    private final static QName _Producto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "producto");
    private final static QName _DeleteProducto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "deleteProducto");
    private final static QName _ReadProductoResponse_QNAME = new QName("http://source.SoapMuestra.lain.com/", "readProductoResponse");
    private final static QName _ClearListaProductoResponse_QNAME = new QName("http://source.SoapMuestra.lain.com/", "clearListaProductoResponse");
    private final static QName _UpdateProducto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "updateProducto");
    private final static QName _ReadProducto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "readProducto");
    private final static QName _CreateProductoResponse_QNAME = new QName("http://source.SoapMuestra.lain.com/", "createProductoResponse");
    private final static QName _GetListaProducto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "getListaProducto");
    private final static QName _CreateProducto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "createProducto");
    private final static QName _ClearListaProducto_QNAME = new QName("http://source.SoapMuestra.lain.com/", "clearListaProducto");
    private final static QName _UpdateProductoResponse_QNAME = new QName("http://source.SoapMuestra.lain.com/", "updateProductoResponse");
    private final static QName _DeleteProductoResponse_QNAME = new QName("http://source.SoapMuestra.lain.com/", "deleteProductoResponse");
    private final static QName _GetListaProductoResponse_QNAME = new QName("http://source.SoapMuestra.lain.com/", "getListaProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lain.soapmuestra.source
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateProducto }
     * 
     */
    public UpdateProducto createUpdateProducto() {
        return new UpdateProducto();
    }

    /**
     * Create an instance of {@link ClearListaProductoResponse }
     * 
     */
    public ClearListaProductoResponse createClearListaProductoResponse() {
        return new ClearListaProductoResponse();
    }

    /**
     * Create an instance of {@link ReadProductoResponse }
     * 
     */
    public ReadProductoResponse createReadProductoResponse() {
        return new ReadProductoResponse();
    }

    /**
     * Create an instance of {@link DeleteProducto }
     * 
     */
    public DeleteProducto createDeleteProducto() {
        return new DeleteProducto();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link DeleteProductoResponse }
     * 
     */
    public DeleteProductoResponse createDeleteProductoResponse() {
        return new DeleteProductoResponse();
    }

    /**
     * Create an instance of {@link GetListaProductoResponse }
     * 
     */
    public GetListaProductoResponse createGetListaProductoResponse() {
        return new GetListaProductoResponse();
    }

    /**
     * Create an instance of {@link UpdateProductoResponse }
     * 
     */
    public UpdateProductoResponse createUpdateProductoResponse() {
        return new UpdateProductoResponse();
    }

    /**
     * Create an instance of {@link ClearListaProducto }
     * 
     */
    public ClearListaProducto createClearListaProducto() {
        return new ClearListaProducto();
    }

    /**
     * Create an instance of {@link CreateProducto }
     * 
     */
    public CreateProducto createCreateProducto() {
        return new CreateProducto();
    }

    /**
     * Create an instance of {@link GetListaProducto }
     * 
     */
    public GetListaProducto createGetListaProducto() {
        return new GetListaProducto();
    }

    /**
     * Create an instance of {@link CreateProductoResponse }
     * 
     */
    public CreateProductoResponse createCreateProductoResponse() {
        return new CreateProductoResponse();
    }

    /**
     * Create an instance of {@link ReadProducto }
     * 
     */
    public ReadProducto createReadProducto() {
        return new ReadProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "producto")
    public JAXBElement<Type> createProducto(Type value) {
        return new JAXBElement<Type>(_Producto_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "deleteProducto")
    public JAXBElement<DeleteProducto> createDeleteProducto(DeleteProducto value) {
        return new JAXBElement<DeleteProducto>(_DeleteProducto_QNAME, DeleteProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "readProductoResponse")
    public JAXBElement<ReadProductoResponse> createReadProductoResponse(ReadProductoResponse value) {
        return new JAXBElement<ReadProductoResponse>(_ReadProductoResponse_QNAME, ReadProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearListaProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "clearListaProductoResponse")
    public JAXBElement<ClearListaProductoResponse> createClearListaProductoResponse(ClearListaProductoResponse value) {
        return new JAXBElement<ClearListaProductoResponse>(_ClearListaProductoResponse_QNAME, ClearListaProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "updateProducto")
    public JAXBElement<UpdateProducto> createUpdateProducto(UpdateProducto value) {
        return new JAXBElement<UpdateProducto>(_UpdateProducto_QNAME, UpdateProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "readProducto")
    public JAXBElement<ReadProducto> createReadProducto(ReadProducto value) {
        return new JAXBElement<ReadProducto>(_ReadProducto_QNAME, ReadProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "createProductoResponse")
    public JAXBElement<CreateProductoResponse> createCreateProductoResponse(CreateProductoResponse value) {
        return new JAXBElement<CreateProductoResponse>(_CreateProductoResponse_QNAME, CreateProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "getListaProducto")
    public JAXBElement<GetListaProducto> createGetListaProducto(GetListaProducto value) {
        return new JAXBElement<GetListaProducto>(_GetListaProducto_QNAME, GetListaProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "createProducto")
    public JAXBElement<CreateProducto> createCreateProducto(CreateProducto value) {
        return new JAXBElement<CreateProducto>(_CreateProducto_QNAME, CreateProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearListaProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "clearListaProducto")
    public JAXBElement<ClearListaProducto> createClearListaProducto(ClearListaProducto value) {
        return new JAXBElement<ClearListaProducto>(_ClearListaProducto_QNAME, ClearListaProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "updateProductoResponse")
    public JAXBElement<UpdateProductoResponse> createUpdateProductoResponse(UpdateProductoResponse value) {
        return new JAXBElement<UpdateProductoResponse>(_UpdateProductoResponse_QNAME, UpdateProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "deleteProductoResponse")
    public JAXBElement<DeleteProductoResponse> createDeleteProductoResponse(DeleteProductoResponse value) {
        return new JAXBElement<DeleteProductoResponse>(_DeleteProductoResponse_QNAME, DeleteProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://source.SoapMuestra.lain.com/", name = "getListaProductoResponse")
    public JAXBElement<GetListaProductoResponse> createGetListaProductoResponse(GetListaProductoResponse value) {
        return new JAXBElement<GetListaProductoResponse>(_GetListaProductoResponse_QNAME, GetListaProductoResponse.class, null, value);
    }

}
