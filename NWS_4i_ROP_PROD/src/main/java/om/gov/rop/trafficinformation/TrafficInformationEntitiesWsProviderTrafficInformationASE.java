package om.gov.rop.trafficinformation;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.6.0
 * 2024-09-24T09:37:24.639+04:00
 * Generated source version: 3.6.0
 *
 */
@WebServiceClient(name = "TrafficInformation_Entities.ws.provider.TrafficInformation_ASE",
                  wsdlLocation = "file:/C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/src/main/resources/wsdl/trafficUAT.wsdl",
                  targetNamespace = "urn:rop-gov-om:TrafficInformation")
public class TrafficInformationEntitiesWsProviderTrafficInformationASE extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:rop-gov-om:TrafficInformation", "TrafficInformation_Entities.ws.provider.TrafficInformation_ASE");
    public final static QName TrafficInformationEntitiesWsProviderTrafficInformationASEPort = new QName("urn:rop-gov-om:TrafficInformation", "TrafficInformation_Entities_ws_provider_TrafficInformation_ASE_Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/src/main/resources/wsdl/trafficUAT.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TrafficInformationEntitiesWsProviderTrafficInformationASE.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/prasanth.s/Documents/workspaceDIAMTestTwoServices/NWS-ROPservices/src/main/resources/wsdl/trafficUAT.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TrafficInformationEntitiesWsProviderTrafficInformationASE(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TrafficInformationEntitiesWsProviderTrafficInformationASE(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrafficInformationEntitiesWsProviderTrafficInformationASE() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TrafficInformationEntitiesWsProviderTrafficInformationASE(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TrafficInformationEntitiesWsProviderTrafficInformationASE(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TrafficInformationEntitiesWsProviderTrafficInformationASE(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TrafficInformationASEPortType
     */
    @WebEndpoint(name = "TrafficInformation_Entities_ws_provider_TrafficInformation_ASE_Port")
    public TrafficInformationASEPortType getTrafficInformationEntitiesWsProviderTrafficInformationASEPort() {
        return super.getPort(TrafficInformationEntitiesWsProviderTrafficInformationASEPort, TrafficInformationASEPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrafficInformationASEPortType
     */
    @WebEndpoint(name = "TrafficInformation_Entities_ws_provider_TrafficInformation_ASE_Port")
    public TrafficInformationASEPortType getTrafficInformationEntitiesWsProviderTrafficInformationASEPort(WebServiceFeature... features) {
        return super.getPort(TrafficInformationEntitiesWsProviderTrafficInformationASEPort, TrafficInformationASEPortType.class, features);
    }

}
