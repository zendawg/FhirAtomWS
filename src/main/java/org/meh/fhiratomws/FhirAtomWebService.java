/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.meh.fhiratomws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.bind.annotation.XmlElement;
import org.hl7.fhir.Patient;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.impl.ResourceTypeImpl;
//import org.hl7.fhir.Patient;
import org.w3.x2005.atom.impl.FeedTypeImpl;

/**
 *
 * @author rich
 */
@WebService(serviceName = "NewWebService")
public class FhirAtomWebService {

  /**
   * This is a sample web service operation
   */
  @WebMethod(operationName = "feedType")
  @XmlElement(type=FeedTypeImpl.class)
  public void foo(@WebParam(name = "feedType") org.w3.x2005.atom.impl.FeedTypeImpl txt) {
//    return null;
  }

//  /**
//   * This is a sample web service operation
//   */
//  @WebMethod(operationName = "method1")
//  @XmlElement(type=FeedTypeImpl.class)
//  public void method1(
//          @WebParam(name = "p1") org.w3.x2005.atom.impl.CategoryTypeImpl p1,
//          @WebParam(name = "p2") org.w3.x2005.atom.impl.ContentTypeImpl p2,
//          @WebParam(name = "p3") org.w3.x2005.atom.impl.DateTimeTypeImpl p3,
//          @WebParam(name = "p4") org.w3.x2005.atom.impl.EmailTypeImpl p4,
//          @WebParam(name = "p5") org.w3.x2005.atom.impl.EntryDocumentImpl p5,
//          @WebParam(name = "p6") org.w3.x2005.atom.impl.EntryTypeImpl p6,
//          @WebParam(name = "p7") org.w3.x2005.atom.impl.FeedDocumentImpl p7,
//          @WebParam(name = "p8") org.w3.x2005.atom.impl.FeedTypeImpl p8,
//          @WebParam(name = "p9") org.w3.x2005.atom.impl.CategoryTypeImpl p9,
//          @WebParam(name = "p10") org.w3.x2005.atom.impl.ContentTypeImpl p10,
//          @WebParam(name = "p11") org.w3.x2005.atom.impl.DateTimeTypeImpl p11,
//          @WebParam(name = "p12") org.w3.x2005.atom.impl.EmailTypeImpl p12,
//          @WebParam(name = "p13") org.w3.x2005.atom.impl.EntryDocumentImpl p13,
//          @WebParam(name = "p14") org.w3.x2005.atom.impl.EntryTypeImpl p14,
//          @WebParam(name = "p15") org.w3.x2005.atom.impl.FeedDocumentImpl p15,
//          @WebParam(name = "p16") org.w3.x2005.atom.impl.FeedTypeImpl p16) {
////    return null;
//  }

  /**
   * This is a sample web service operation
   */
//  @WebMethod(operationName = "bar")
//  @XmlElement(type=RSPK21QUERYRESPONSECONTENT.class)
//  public void bar(@WebParam(name = "name") RSPK21QUERYRESPONSECONTENT txt) {
////    return null;
//  }

  /**
   * This is a sample web service operation
   */
  @WebMethod(operationName = "fhir")
  @XmlElement(type=Patient.class)
  public void bar(@WebParam(name = "n1") Patient n1) {
//    return null;
  }
  @WebMethod(operationName = "fhirResourceType")
  @XmlElement(type=ResourceTypeImpl.class)
  public void bar(@WebParam(name = "n1") ResourceTypeImpl n1) {
//    return null;
  }
}
