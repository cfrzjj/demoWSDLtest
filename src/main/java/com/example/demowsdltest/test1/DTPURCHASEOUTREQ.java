
package com.example.demowsdltest.test1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DT_PURCHASE_OUT_REQ complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DT_PURCHASE_OUT_REQ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PR_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REQUESTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="T_ITEM" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ACCTASSCAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITEM_CAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PUR_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MATERIAL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SHORT_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DELIV_DATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PLANT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="STORE_LOC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PREQ_NAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="MATL_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="WBS_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FIXED_VEND" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PURCH_ORG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="INFO_RFC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GL_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="COSTCENTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SD_DOC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ITM_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ORDERID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_PURCHASE_OUT_REQ", propOrder = {
    "prtype",
    "requestid",
    "titem"
})
public class DTPURCHASEOUTREQ {

    @XmlElement(name = "PR_TYPE", required = true)
    protected String prtype;
    @XmlElement(name = "REQUESTID", required = true)
    protected String requestid;
    @XmlElement(name = "T_ITEM")
    protected List<DTPURCHASEOUTREQ.TITEM> titem;

    /**
     * ��ȡprtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRTYPE() {
        return prtype;
    }

    /**
     * ����prtype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRTYPE(String value) {
        this.prtype = value;
    }

    /**
     * ��ȡrequestid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTID() {
        return requestid;
    }

    /**
     * ����requestid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTID(String value) {
        this.requestid = value;
    }

    /**
     * Gets the value of the titem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTPURCHASEOUTREQ.TITEM }
     * 
     * 
     */
    public List<DTPURCHASEOUTREQ.TITEM> getTITEM() {
        if (titem == null) {
            titem = new ArrayList<DTPURCHASEOUTREQ.TITEM>();
        }
        return this.titem;
    }



    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ACCTASSCAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITEM_CAT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PUR_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MATERIAL" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SHORT_TEXT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="QUANTITY" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="UNIT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="DELIV_DATE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PLANT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="STORE_LOC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PREQ_NAME" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="MATL_GROUP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="WBS_ELEMENT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FIXED_VEND" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PURCH_ORG" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="INFO_RFC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GL_ACCOUNT" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="COSTCENTER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SD_DOC" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ITM_NUMBER" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ORDERID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acctasscat",
        "itemcat",
        "purgroup",
        "material",
        "shorttext",
        "quantity",
        "unit",
        "delivdate",
        "plant",
        "storeloc",
        "preqname",
        "matlgroup",
        "wbselement",
        "fixedvend",
        "purchorg",
        "inforfc",
        "glaccount",
        "costcenter",
        "sddoc",
        "itmnumber",
        "orderid"
    })
    public static class TITEM {

        @XmlElement(name = "ACCTASSCAT")
        protected List<String> acctasscat;
        @XmlElement(name = "ITEM_CAT")
        protected List<String> itemcat;
        @XmlElement(name = "PUR_GROUP")
        protected List<String> purgroup;
        @XmlElement(name = "MATERIAL")
        protected List<String> material;
        @XmlElement(name = "SHORT_TEXT")
        protected List<String> shorttext;
        @XmlElement(name = "QUANTITY")
        protected List<String> quantity;
        @XmlElement(name = "UNIT")
        protected List<String> unit;
        @XmlElement(name = "DELIV_DATE")
        protected List<String> delivdate;
        @XmlElement(name = "PLANT")
        protected List<String> plant;
        @XmlElement(name = "STORE_LOC")
        protected List<String> storeloc;
        @XmlElement(name = "PREQ_NAME")
        protected List<String> preqname;
        @XmlElement(name = "MATL_GROUP")
        protected List<String> matlgroup;
        @XmlElement(name = "WBS_ELEMENT")
        protected List<String> wbselement;
        @XmlElement(name = "FIXED_VEND")
        protected List<String> fixedvend;
        @XmlElement(name = "PURCH_ORG")
        protected List<String> purchorg;
        @XmlElement(name = "INFO_RFC")
        protected List<String> inforfc;
        @XmlElement(name = "GL_ACCOUNT")
        protected List<String> glaccount;
        @XmlElement(name = "COSTCENTER")
        protected List<String> costcenter;
        @XmlElement(name = "SD_DOC")
        protected List<String> sddoc;
        @XmlElement(name = "ITM_NUMBER")
        protected List<String> itmnumber;
        @XmlElement(name = "ORDERID")
        protected List<String> orderid;

        /**
         * Gets the value of the acctasscat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acctasscat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getACCTASSCAT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getACCTASSCAT() {
            if (acctasscat == null) {
                acctasscat = new ArrayList<String>();
            }
            return this.acctasscat;
        }

        /**
         * Gets the value of the itemcat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemcat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITEMCAT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getITEMCAT() {
            if (itemcat == null) {
                itemcat = new ArrayList<String>();
            }
            return this.itemcat;
        }

        /**
         * Gets the value of the purgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPURGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPURGROUP() {
            if (purgroup == null) {
                purgroup = new ArrayList<String>();
            }
            return this.purgroup;
        }

        /**
         * Gets the value of the material property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the material property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMATERIAL().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMATERIAL() {
            if (material == null) {
                material = new ArrayList<String>();
            }
            return this.material;
        }

        /**
         * Gets the value of the shorttext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shorttext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSHORTTEXT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSHORTTEXT() {
            if (shorttext == null) {
                shorttext = new ArrayList<String>();
            }
            return this.shorttext;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the quantity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQUANTITY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getQUANTITY() {
            if (quantity == null) {
                quantity = new ArrayList<String>();
            }
            return this.quantity;
        }

        /**
         * Gets the value of the unit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUNIT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getUNIT() {
            if (unit == null) {
                unit = new ArrayList<String>();
            }
            return this.unit;
        }

        /**
         * Gets the value of the delivdate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delivdate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDELIVDATE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDELIVDATE() {
            if (delivdate == null) {
                delivdate = new ArrayList<String>();
            }
            return this.delivdate;
        }

        /**
         * Gets the value of the plant property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plant property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLANT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPLANT() {
            if (plant == null) {
                plant = new ArrayList<String>();
            }
            return this.plant;
        }

        /**
         * Gets the value of the storeloc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the storeloc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSTORELOC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSTORELOC() {
            if (storeloc == null) {
                storeloc = new ArrayList<String>();
            }
            return this.storeloc;
        }

        /**
         * Gets the value of the preqname property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preqname property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPREQNAME().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPREQNAME() {
            if (preqname == null) {
                preqname = new ArrayList<String>();
            }
            return this.preqname;
        }

        /**
         * Gets the value of the matlgroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matlgroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMATLGROUP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMATLGROUP() {
            if (matlgroup == null) {
                matlgroup = new ArrayList<String>();
            }
            return this.matlgroup;
        }

        /**
         * Gets the value of the wbselement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the wbselement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWBSELEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWBSELEMENT() {
            if (wbselement == null) {
                wbselement = new ArrayList<String>();
            }
            return this.wbselement;
        }

        /**
         * Gets the value of the fixedvend property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fixedvend property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFIXEDVEND().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFIXEDVEND() {
            if (fixedvend == null) {
                fixedvend = new ArrayList<String>();
            }
            return this.fixedvend;
        }

        /**
         * Gets the value of the purchorg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the purchorg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPURCHORG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPURCHORG() {
            if (purchorg == null) {
                purchorg = new ArrayList<String>();
            }
            return this.purchorg;
        }

        /**
         * Gets the value of the inforfc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inforfc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getINFORFC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getINFORFC() {
            if (inforfc == null) {
                inforfc = new ArrayList<String>();
            }
            return this.inforfc;
        }

        /**
         * Gets the value of the glaccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the glaccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGLACCOUNT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGLACCOUNT() {
            if (glaccount == null) {
                glaccount = new ArrayList<String>();
            }
            return this.glaccount;
        }

        /**
         * Gets the value of the costcenter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the costcenter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCOSTCENTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCOSTCENTER() {
            if (costcenter == null) {
                costcenter = new ArrayList<String>();
            }
            return this.costcenter;
        }

        /**
         * Gets the value of the sddoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sddoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSDDOC().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSDDOC() {
            if (sddoc == null) {
                sddoc = new ArrayList<String>();
            }
            return this.sddoc;
        }

        /**
         * Gets the value of the itmnumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itmnumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getITMNUMBER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getITMNUMBER() {
            if (itmnumber == null) {
                itmnumber = new ArrayList<String>();
            }
            return this.itmnumber;
        }

        /**
         * Gets the value of the orderid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getORDERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getORDERID() {
            if (orderid == null) {
                orderid = new ArrayList<String>();
            }
            return this.orderid;
        }

    }

}
