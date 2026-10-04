package com.aspose.words.net.System.Data;

import com.aspose.words.internal.zzZEO;
import com.aspose.words.internal.zzZHV;
import com.aspose.words.internal.zzZK7;
import com.aspose.words.internal.zzZKN;
import com.aspose.words.internal.zzZL9;
import com.aspose.words.internal.zzZLR;
import com.aspose.words.internal.zzZMJ;
import com.aspose.words.internal.zzZN3;
import com.aspose.words.internal.zzZN5;
import com.aspose.words.internal.zzZN8;
import com.aspose.words.internal.zzZOP;
import com.aspose.words.internal.zzZOR;
import com.aspose.words.internal.zzZQR;
import com.aspose.words.internal.zzZQS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class DataSet {
    private Locale zz0w;
    private String zzWRj;
    private DataRelationCollection zzWRk;
    private DataTableCollection zzWRl;
    private String zzWRm;
    private String zzWRn;
    private boolean zzWRo;
    private boolean zzWRp;
    private String zzYr0;

    /* JADX INFO: renamed from: com.aspose.words.net.System.Data.DataSet$1 */
    public static /* synthetic */ class C159121 {
        static final /* synthetic */ int[] zzWRi;

        static {
            int[] iArr = new int[XmlReadMode.values().length];
            zzWRi = iArr;
            try {
                iArr[XmlReadMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWRi[XmlReadMode.DIFF_GRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWRi[XmlReadMode.FRAGMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWRi[XmlReadMode.IGNORE_SCHEMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWRi[XmlReadMode.INFER_SCHEMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public DataSet() {
        this.zzWRp = true;
        this.zzWRo = false;
        this.zzWRn = "NewDataSet";
        this.zzWRm = "_Id";
        this.zzWRl = new DataTableCollection(this);
        this.zzWRk = new DataRelationCollection();
    }

    private static zzZEO zzXQk() {
        zzZEO zzzeo = new zzZEO();
        zzzeo.zzXMb().zzPj(false);
        zzzeo.zzXMb().zzPr(false);
        zzzeo.zzXMb().zzPs(false);
        zzzeo.zzXMb().zzPt(true);
        zzzeo.zzXMb().zzPu(true);
        zzzeo.zzXMb().zzPq(false);
        return zzzeo;
    }

    private static void zzXQl() {
        throw new UnsupportedOperationException("readXDSSchema is not implemented yet.");
    }

    private void zzb(zzZQR zzzqr) throws zzZMJ, DataException, InvalidConstraintException, zzZQS {
        zzZLR zzzlr = new zzZLR();
        zzZN3 zzzn3ZzY = zzZN3.zzY(zzzqr);
        zzzn3ZzY.zzUx(this.zzWRj);
        zzzlr.zzN(zzzn3ZzY);
        zzzlr.zzfX();
        new zzZL9().zzZ(zzzlr, this);
        this.zzWRo = true;
    }

    private void zzc(zzZQR zzzqr) throws zzZMJ, DataException, InvalidConstraintException, zzZQS {
        boolean zZzU3 = false;
        int i = 0;
        do {
            int eventType = zzzqr.getEventType();
            if (eventType == 1) {
                if (zZzU3) {
                    i++;
                }
                if (zzzqr.getLocalName().equals("Schema") && zzzqr.getNamespaceURI().equals("urn:schemas-microsoft-com:xml-data")) {
                    zzXQl();
                    return;
                }
                if (zzzqr.getLocalName().equals("schema") && zzzqr.getNamespaceURI().equals("http://www.w3.org/2001/XMLSchema")) {
                    zzb(zzzqr);
                    return;
                } else {
                    if (zzzqr.getLocalName().equals("schema") && zzzqr.getNamespaceURI().startsWith("http://www.w3.org/")) {
                        throw new IllegalStateException("DataSetUnsupportedSchema http://www.w3.org/2001/XMLSchema");
                    }
                    zZzU3 = false;
                }
            } else if (eventType == 2) {
                i--;
                if (i <= 0) {
                    return;
                }
            } else if (eventType == 4) {
                zZzU3 = zzZKN.zzU3(zzzqr.getText().trim());
            }
            if (zzzqr.hasNext()) {
                zzzqr.next();
            }
        } while (zzzqr.hasNext());
    }

    private static void zzd(zzZQR zzzqr) throws zzZQS {
        String localName = zzzqr.getLocalName();
        while (zzzqr.hasNext()) {
            if (zzzqr.next() == 2 && localName.equals(zzzqr.getLocalName())) {
                return;
            }
        }
    }

    public boolean IsSchemaWasRead() {
        return this.zzWRo;
    }

    public void clear() {
        Iterator<DataTable> it = getTables().iterator();
        while (it.hasNext()) {
            it.next().getRows().clear();
        }
    }

    public void close() throws Exception {
        Iterator<DataTable> it = this.zzWRl.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public String getDataSetName() {
        return this.zzWRn;
    }

    public boolean getEnforceConstraints() {
        return this.zzWRp;
    }

    public String getNamespace() {
        return this.zzYr0;
    }

    public DataRelationCollection getRelations() {
        return this.zzWRk;
    }

    public DataTableCollection getTables() {
        return this.zzWRl;
    }

    public boolean isLocaleSpecified() {
        return this.zz0w != null;
    }

    public XmlReadMode readXml(InputStream inputStream, XmlReadMode xmlReadMode) throws DataException {
        boolean z;
        zzZN5 zzzn5;
        if (inputStream == null) {
            return xmlReadMode;
        }
        try {
            zzZQR zzzqrZzZ = zzXQk().zzZ(inputStream);
            int i = 4;
            boolean z2 = true;
            if (zzzqrZzZ.hasNext() && zzzqrZzZ.next() == 1) {
                if (zzzqrZzZ.getLocalName().equals("diffgram") && zzzqrZzZ.getNamespaceURI().equals("urn:schemas-microsoft-com:xml-diffgram-v1")) {
                    int i2 = C159121.zzWRi[xmlReadMode.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        new zzQ(this).zz9(zzzqrZzZ);
                        return XmlReadMode.DIFF_GRAM;
                    }
                    if (i2 != 3) {
                        zzd(zzzqrZzZ);
                        return xmlReadMode;
                    }
                    zzd(zzzqrZzZ);
                }
                if ((zzzqrZzZ.getLocalName().equals("Schema") && zzzqrZzZ.getNamespaceURI().equals("urn:schemas-microsoft-com:xml-data")) || (zzzqrZzZ.getLocalName().equals("schema") && zzzqrZzZ.getNamespaceURI().equals("http://www.w3.org/2001/XMLSchema"))) {
                    int i3 = C159121.zzWRi[xmlReadMode.ordinal()];
                    if (i3 == 1) {
                        if (getTables().getCount() == 0) {
                            zzc(zzzqrZzZ);
                            return XmlReadMode.READ_SCHEMA;
                        }
                        zzd(zzzqrZzZ);
                        return XmlReadMode.IGNORE_SCHEMA;
                    }
                    if (i3 != 3) {
                        if (i3 == 4 || i3 == 5) {
                            zzd(zzzqrZzZ);
                            return xmlReadMode;
                        }
                        zzc(zzzqrZzZ);
                        return xmlReadMode;
                    }
                    zzc(zzzqrZzZ);
                    z = true;
                } else {
                    z = false;
                }
                zzzn5 = new zzZN5();
                zzzn5.setName(zzZN8.decode(zzzqrZzZ.getLocalName()));
                for (int i4 = 0; i4 < zzzqrZzZ.getAttributeCount(); i4++) {
                    if ("".equals(zzzqrZzZ.getAttributePrefix(i4))) {
                        zzzn5.getAttributes().put(zzzqrZzZ.zzRu(i4), zzzqrZzZ.getAttributeValue(i4));
                    }
                }
            } else {
                z = false;
                zzzn5 = null;
            }
            XmlReadMode xmlReadMode2 = xmlReadMode;
            boolean z3 = z;
            zzQ zzq = null;
            XmlReadMode xmlReadMode3 = xmlReadMode2;
            while (zzzqrZzZ.hasNext()) {
                if (zzzqrZzZ.next() == z2) {
                    if ((zzzqrZzZ.getLocalName().equals("Schema") && zzzqrZzZ.getNamespaceURI().equals("urn:schemas-microsoft-com:xml-data")) || (zzzqrZzZ.getLocalName().equals("schema") && zzzqrZzZ.getNamespaceURI().equals("http://www.w3.org/2001/XMLSchema"))) {
                        zzzqrZzZ.getLocalName();
                        int i5 = C159121.zzWRi[xmlReadMode3.ordinal()];
                        if (i5 == i || i5 == 5) {
                            zzd(zzzqrZzZ);
                        } else {
                            zzc(zzzqrZzZ);
                            xmlReadMode2 = XmlReadMode.READ_SCHEMA;
                            z3 = z2;
                        }
                        i = 4;
                    } else {
                        if (!zzzqrZzZ.getLocalName().equals("diffgram") || !zzzqrZzZ.getNamespaceURI().equals("urn:schemas-microsoft-com:xml-diffgram-v1")) {
                            if (z3 || xmlReadMode2 == XmlReadMode.READ_SCHEMA || xmlReadMode3 == XmlReadMode.IGNORE_SCHEMA || xmlReadMode3 == XmlReadMode.FRAGMENT || (getTables().getCount() != 0 && xmlReadMode3 != XmlReadMode.INFER_SCHEMA)) {
                                xmlReadMode3 = z3 ? XmlReadMode.READ_SCHEMA : XmlReadMode.IGNORE_SCHEMA;
                                new zzR(this, zzzqrZzZ, zzzn5, false).zzXPZ();
                            }
                            if (xmlReadMode3 == XmlReadMode.AUTO) {
                                xmlReadMode2 = XmlReadMode.INFER_SCHEMA;
                            }
                            if (zzzqrZzZ.getLocalName().equals(zzzn5.getName())) {
                                zzzn5.getAttributes().put(zzzqrZzZ.getLocalName() + this.zzWRm, null);
                            }
                            new zzR(this, zzzqrZzZ, zzzn5, z2).zzXPZ();
                            return xmlReadMode2;
                        }
                        XmlReadMode xmlReadMode4 = XmlReadMode.DIFF_GRAM;
                        if (xmlReadMode3 == xmlReadMode4 || xmlReadMode3 == XmlReadMode.IGNORE_SCHEMA || xmlReadMode3 == XmlReadMode.AUTO) {
                            if (zzq == null) {
                                zzq = new zzQ(this);
                            }
                            zzq.zz9(zzzqrZzZ);
                            if (xmlReadMode3 == xmlReadMode4) {
                                return xmlReadMode4;
                            }
                            xmlReadMode2 = xmlReadMode4;
                        } else {
                            zzd(zzzqrZzZ);
                        }
                        i = 4;
                    }
                }
                i = 4;
                z2 = true;
            }
            return XmlReadMode.AUTO;
        } catch (zzZMJ e) {
            throw new DataException(e);
        } catch (zzZQS e2) {
            throw new DataException(e2);
        } catch (InvalidConstraintException e3) {
            throw new DataException(e3);
        } catch (SQLException e4) {
            throw new DataException(e4);
        }
    }

    public void readXmlSchema(zzZOP zzzop) throws DataException {
        readXmlSchema(zzZOP.zzZG(zzzop));
    }

    public void reset() {
        clear();
        Iterator<DataTable> it = this.zzWRl.iterator();
        while (it.hasNext()) {
            it.remove();
        }
        Iterator<DataRelation> it2 = this.zzWRk.iterator();
        while (it2.hasNext()) {
            it2.remove();
        }
    }

    public void setDataSetName(String str) {
        this.zzWRn = str;
    }

    public void setEnforceConstraints(boolean z) {
        this.zzWRp = z;
        Iterator<DataTable> it = getTables().iterator();
        while (it.hasNext()) {
            it.next().setEnforceConstraints(z);
        }
    }

    public void setLocale(Locale locale) {
        this.zz0w = locale;
    }

    public void readXmlSchema(InputStream inputStream) throws DataException {
        if (inputStream == null) {
            throw new IllegalArgumentException("xmlStream cannot be null");
        }
        zzZQR zzzqrZzZ = null;
        try {
            try {
                zzzqrZzZ = zzXQk().zzZ(inputStream);
                zzc(zzzqrZzZ);
                if (zzzqrZzZ != null) {
                    try {
                        zzzqrZzZ.close();
                    } catch (zzZQS e) {
                        throw new DataException(e);
                    }
                }
            } catch (zzZMJ e2) {
                throw new DataException(e2);
            } catch (zzZQS e3) {
                throw new DataException(e3);
            } catch (InvalidConstraintException e4) {
                throw new DataException(e4);
            }
        } catch (Throwable th) {
            if (zzzqrZzZ != null) {
                try {
                    zzzqrZzZ.close();
                } catch (zzZQS e5) {
                    throw new DataException(e5);
                }
            }
            throw th;
        }
    }

    public DataSet(Connection connection) throws Exception {
        this(connection, "");
    }

    public DataSet(Connection connection, String str) throws Exception {
        this.zzWRp = true;
        this.zzWRo = false;
        this.zzWRn = "NewDataSet";
        this.zzWRm = "_Id";
        this.zzWRl = new DataTableCollection(this);
        this.zzWRk = new DataRelationCollection();
        if (connection != null) {
            DatabaseMetaData metaData = connection.getMetaData();
            String catalog = connection.getCatalog();
            for (String str2 : zzY.zzZ(metaData, str, catalog)) {
                String strZzXS = zzY.zzXS(str, str2);
                DataTable dataTable = new DataTable(connection.createStatement().executeQuery("SELECT * FROM " + strZzXS), str2);
                dataTable.zzW(zzY.zzZ(metaData, catalog, str, str2));
                getTables().add(dataTable);
                zzY.zzZ(metaData, catalog, str, dataTable);
            }
            Iterator<DataRelation> it = zzY.zzZ(metaData, catalog, str, getTables()).iterator();
            while (it.hasNext()) {
                getRelations().add(it.next());
            }
            return;
        }
        throw new IllegalArgumentException("Connection cannot be null");
    }

    public void readXmlSchema(String str) throws Throwable {
        FileInputStream fileInputStream;
        if (str != null && str.trim().length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                this.zzWRj = str;
                try {
                    fileInputStream = new FileInputStream(str);
                } catch (FileNotFoundException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                readXmlSchema(fileInputStream);
                try {
                    fileInputStream.close();
                    return;
                } catch (Exception e2) {
                    zzZHV.zzZ(e2);
                    return;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                throw new DataException(e);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e4) {
                        zzZHV.zzZ(e4);
                    }
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("xmlPath cannot be empty");
    }

    public DataSet(String str) {
        this.zzWRp = true;
        this.zzWRo = false;
        this.zzWRn = "NewDataSet";
        this.zzWRm = "_Id";
        this.zzWRl = new DataTableCollection(this);
        this.zzWRk = new DataRelationCollection();
        this.zzWRn = str;
    }

    public XmlReadMode readXml(zzZOP zzzop) throws DataException {
        return readXml(zzZOP.zzZG(zzzop));
    }

    public XmlReadMode readXml(InputStream inputStream) throws DataException {
        return readXml(inputStream, XmlReadMode.AUTO);
    }

    public XmlReadMode readXml(String str) throws DataException {
        return readXml(str, XmlReadMode.AUTO);
    }

    public XmlReadMode readXml(String str, XmlReadMode xmlReadMode) throws Throwable {
        FileInputStream fileInputStream;
        if (str != null && str.trim().length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    this.zzWRj = str;
                    fileInputStream = new FileInputStream(str);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            }
            try {
                XmlReadMode xml = readXml(fileInputStream, xmlReadMode);
                try {
                    fileInputStream.close();
                    return xml;
                } catch (Exception e2) {
                    zzZHV.zzZ(e2);
                    return xml;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                throw new DataException(e);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e4) {
                        zzZHV.zzZ(e4);
                    }
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("xmlPath cannot be empty");
    }

    @Deprecated
    public XmlReadMode readXml(zzZOR zzzor) {
        return readXml(new zzZK7(zzzor));
    }
}
