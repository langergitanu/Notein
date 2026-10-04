package oO0ooO;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.internal.C22245OooO0oO;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
import o00o0OOO.C25402OooO0o0;
import o00o0Oo0.C25419OooO00o;
import oO0oO0Oo.AbstractC34015OooO0OO;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34027OooOOOo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.o00Oo0;
import oO0oO0oo.C34085OooO0O0;
import oO0oOOOO.C34115OooO0Oo;
import oO0oOOOO.C34116OooO0o;
import oO0oOOOO.C34118OooO0oO;
import oO0oOOOO.C34119OooO0oo;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOOo.C34129OooO00o;
import oO0oOo.C34136OooO00o;
import oO0oOo.C34137OooO0O0;
import oO0oOo.C34138OooO0OO;
import oO0oOo.C34139OooO0Oo;
import oO0oOo.C34140OooO0o0;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34145OooO0Oo;
import oO0oOo0.C34149OooO0oo;
import oO0oOo0.C34162OooOo00;
import oO0oOo0O.C34168OooO0O0;
import oO0oOo0O.InterfaceC34171OooO0o;
import oO0oooO0.C34294OooO00o;
import oOO000oo.C34338OooO00o;
import oOO000oo.C34339OooO0O0;
import oOO000oo.C34340OooO0OO;
import oOO000oo.C34343OooO0o0;
import oOO00O00.C34345OooO0Oo;

/* JADX INFO: renamed from: oO0ooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34255OooO0Oo extends C34345OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashMap f123006OooOo0o;

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO */
    public class OooO implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            return C34162OooOo00.OooO0oo(oooO0O0.f123283OooO0OO);
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO00o */
    public class OooO00o implements InterfaceC34254OooO0OO {
        @Override // oO0ooO.InterfaceC34254OooO0OO
        public final C34253OooO0O0 OooO00o(byte[] bArr) throws IOException {
            try {
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(bArr);
                if (abstractC34039OooOooOOooOOoo.size() != 6) {
                    throw new C34252OooO00o("malformed sequence in DSA private key");
                }
                C34029OooOOo0 c34029OooOOo0OooOOo0 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(1));
                C34029OooOOo0 c34029OooOOo0OooOOo02 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(2));
                C34029OooOOo0 c34029OooOOo0OooOOo03 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(3));
                C34029OooOOo0 c34029OooOOo0OooOOo04 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(4));
                C34029OooOOo0 c34029OooOOo0OooOOo05 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(5));
                C34032OooOo0O c34032OooOo0O = InterfaceC34171OooO0o.f122787OooOOo;
                return new C34253OooO0O0(new C34162OooOo00(new C34142OooO00o(c34032OooOo0O, new C34149OooO0oo(c34029OooOOo0OooOOo0.OooOOo(), c34029OooOOo0OooOOo02.OooOOo(), c34029OooOOo0OooOOo03.OooOOo())), c34029OooOOo0OooOOo04), new C34116OooO0o(new C34142OooO00o(c34032OooOo0O, new C34149OooO0oo(c34029OooOOo0OooOOo0.OooOOo(), c34029OooOOo0OooOOo02.OooOOo(), c34029OooOOo0OooOOo03.OooOOo())), c34029OooOOo0OooOOo05, null, null));
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("problem creating DSA private key: ")), e2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0O0 */
    public class OooO0O0 implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO(oooO0O0.f123283OooO0OO);
                if (abstractC34036OooOoOOOooOOO instanceof C34032OooOo0O) {
                    return AbstractC34036OooOoOO.OooOOO(oooO0O0.f123283OooO0OO);
                }
                if (abstractC34036OooOoOOOooOOO instanceof AbstractC34039OooOooO) {
                    return C34168OooO0O0.OooO0oo((AbstractC34039OooOooO) abstractC34036OooOoOOOooOOO);
                }
                return null;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("exception extracting EC named curve: ")));
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0OO */
    public class OooO0OO implements InterfaceC34254OooO0OO {
        @Override // oO0ooO.InterfaceC34254OooO0OO
        public final C34253OooO0O0 OooO00o(byte[] bArr) throws IOException {
            C34129OooO00o c34129OooO00o;
            try {
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(bArr);
                if (abstractC34039OooOooOOooOOoo != null) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo);
                    c34129OooO00o = new C34129OooO00o();
                    c34129OooO00o.f122638OooOo0o = abstractC34039OooOooOOooOOoo2;
                } else {
                    c34129OooO00o = null;
                }
                C34142OooO00o c34142OooO00o = new C34142OooO00o(InterfaceC34171OooO0o.f122784OooOOO0, c34129OooO00o.OooO0oo(0, -1));
                C34116OooO0o c34116OooO0o = new C34116OooO0o(c34142OooO00o, c34129OooO00o, null, null);
                return ((AbstractC34015OooO0OO) c34129OooO00o.OooO0oo(1, 3)) != null ? new C34253OooO0O0(new C34162OooOo00(c34142OooO00o, ((AbstractC34015OooO0OO) c34129OooO00o.OooO0oo(1, 3)).OooOOo()), c34116OooO0o) : new C34253OooO0O0(null, c34116OooO0o);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("problem creating EC private key: ")), e2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public class C20344OooO0Oo implements oOO00O00.OooO0OO {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                byte[] bArr = oooO0O0.f123283OooO0OO;
                if (bArr instanceof C34115OooO0Oo) {
                } else if (bArr != 0) {
                    AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(bArr);
                    C34115OooO0Oo c34115OooO0Oo = new C34115OooO0Oo();
                    Enumeration enumerationOooOo0O = abstractC34039OooOooOOooOOoo.OooOo0O();
                    c34115OooO0Oo.f122583OooOo0o = C34142OooO00o.OooO0oo(enumerationOooOo0O.nextElement());
                    c34115OooO0Oo.f122582OooOo = AbstractC34033OooOo0o.OooOOo0(enumerationOooOo0O.nextElement());
                }
                return new C25419OooO00o();
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing ENCRYPTED PRIVATE KEY: ")), e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0o */
    public class OooO0o implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return new C34294OooO00o(oooO0O0.f123283OooO0OO);
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing certrequest: ")), e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0o0, reason: case insensitive filesystem */
    public class C34256OooO0o0 implements oOO00O00.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC34254OooO0OO f123007OooO00o;

        public C34256OooO0o0(InterfaceC34254OooO0OO interfaceC34254OooO0OO) {
            this.f123007OooO00o = interfaceC34254OooO0OO;
        }

        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            boolean z = false;
            String str = null;
            for (oOO00O00.OooO00o oooO00o : oooO0O0.f123282OooO0O0) {
                boolean zEquals = oooO00o.f123278OooO00o.equals("Proc-Type");
                String str2 = oooO00o.f123279OooO0O0;
                if (zEquals && str2.equals("4,ENCRYPTED")) {
                    z = true;
                } else if (oooO00o.f123278OooO00o.equals("DEK-Info")) {
                    str = str2;
                }
            }
            byte[] bArr = oooO0O0.f123283OooO0OO;
            try {
                if (!z) {
                    return this.f123007OooO00o.OooO00o(bArr);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                stringTokenizer.nextToken();
                C34343OooO0o0.OooO00o(stringTokenizer.nextToken());
                return new C25402OooO0o0();
            } catch (IOException e) {
                if (z) {
                    throw new C34252OooO00o("exception decoding - please check password and data.", e);
                }
                throw new C34252OooO00o(e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                if (z) {
                    throw new C34252OooO00o("exception decoding - please check password and data.", e2);
                }
                throw new C34252OooO00o(e2.getMessage(), e2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0oO, reason: case insensitive filesystem */
    public class C34257OooO0oO implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return C34085OooO0O0.OooO0oo(new C34027OooOOOo(oooO0O0.f123283OooO0OO).OooOOoo());
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing PKCS7 object: ")), e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooO0oo, reason: case insensitive filesystem */
    public class C34258OooO0oo implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return C34116OooO0o.OooO0oo(oooO0O0.f123283OooO0OO);
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing PRIVATE KEY: ")), e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooOO0 */
    public class OooOO0 implements InterfaceC34254OooO0OO {
        @Override // oO0ooO.InterfaceC34254OooO0OO
        public final C34253OooO0O0 OooO00o(byte[] bArr) throws IOException {
            try {
                AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(bArr);
                if (abstractC34039OooOooOOooOOoo.size() != 9) {
                    throw new C34252OooO00o("malformed sequence in RSA private key");
                }
                C34118OooO0oO c34118OooO0oOOooO0oo = C34118OooO0oO.OooO0oo(abstractC34039OooOooOOooOOoo);
                BigInteger bigInteger = c34118OooO0oOOooO0oo.f122613OooOo;
                BigInteger bigInteger2 = c34118OooO0oOOooO0oo.f122616OooOoO0;
                C34119OooO0oo c34119OooO0oo = new C34119OooO0oo();
                c34119OooO0oo.f122624OooOo0o = bigInteger;
                c34119OooO0oo.f122623OooOo = bigInteger2;
                C34142OooO00o c34142OooO00o = new C34142OooO00o(InterfaceC34117OooO0o0.f122590OooO00o, o00Oo0.f122442OooOo);
                return new C34253OooO0O0(new C34162OooOo00(c34142OooO00o, c34119OooO0oo), new C34116OooO0o(c34142OooO00o, c34118OooO0oOOooO0oo, null, null));
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("problem creating RSA private key: ")), e2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooOO0O */
    public class OooOO0O implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return new C34162OooOo00(new C34142OooO00o(InterfaceC34117OooO0o0.f122590OooO00o, o00Oo0.f122442OooOo), C34119OooO0oo.OooO0oo(oooO0O0.f123283OooO0OO));
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e2, new StringBuilder("problem extracting key: ")), e2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooOO0o, reason: case insensitive filesystem */
    public class C34259OooOO0o implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            byte[] bArr = oooO0O0.f123283OooO0OO;
            try {
                Set set = C34137OooO0O0.f122676OooO00o;
                AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO(bArr);
                if (abstractC34036OooOoOOOooOOO == null) {
                    throw new IOException("no content found");
                }
                C34145OooO0Oo c34145OooO0OoOooO0oo = C34145OooO0Oo.OooO0oo(abstractC34036OooOoOOOooOOO);
                C34138OooO0OO c34138OooO0OO = new C34138OooO0OO();
                c34138OooO0OO.f122678OooOo0o = c34145OooO0OoOooO0oo;
                c34145OooO0OoOooO0oo.f122690OooOo0o.getClass();
                return c34138OooO0OO;
            } catch (ClassCastException e) {
                throw new C34136OooO00o("malformed data: " + e.getMessage(), e);
            } catch (IllegalArgumentException e2) {
                throw new C34136OooO00o("malformed data: " + e2.getMessage(), e2);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooOOO */
    public class OooOOO implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return new C34140OooO0o0(oooO0O0.f123283OooO0OO);
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing cert: ")), e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooOOO0 */
    public class OooOOO0 implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return new C34139OooO0Oo(oooO0O0.f123283OooO0OO);
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing cert: ")), e);
            }
        }
    }

    /* JADX INFO: renamed from: oO0ooO.OooO0Oo$OooOOOO */
    public class OooOOOO implements oOO00O00.OooO0OO {
        @Override // oOO00O00.OooO0OO
        public final Object OooO00o(oOO00O00.OooO0O0 oooO0O0) throws IOException {
            try {
                return new C34260OooO0o0(oooO0O0.f123283OooO0OO);
            } catch (Exception e) {
                throw new C34252OooO00o(C22245OooO0oO.OooO0Oo(e, new StringBuilder("problem parsing cert: ")), e);
            }
        }
    }

    public C34255OooO0Oo(StringReader stringReader) {
        super(stringReader);
        HashMap map = new HashMap();
        this.f123006OooOo0o = map;
        map.put("CERTIFICATE REQUEST", new OooO0o());
        map.put("NEW CERTIFICATE REQUEST", new OooO0o());
        map.put("CERTIFICATE", new OooOOO());
        map.put("TRUSTED CERTIFICATE", new OooOOOO());
        map.put("X509 CERTIFICATE", new OooOOO());
        map.put("X509 CRL", new OooOOO0());
        map.put("PKCS7", new C34257OooO0oO());
        map.put("CMS", new C34257OooO0oO());
        map.put("ATTRIBUTE CERTIFICATE", new C34259OooOO0o());
        map.put("EC PARAMETERS", new OooO0O0());
        map.put("PUBLIC KEY", new OooO());
        map.put("RSA PUBLIC KEY", new OooOO0O());
        map.put("RSA PRIVATE KEY", new C34256OooO0o0(new OooOO0()));
        map.put("DSA PRIVATE KEY", new C34256OooO0o0(new OooO00o()));
        map.put("EC PRIVATE KEY", new C34256OooO0o0(new OooO0OO()));
        map.put("ENCRYPTED PRIVATE KEY", new C20344OooO0Oo());
        map.put("PRIVATE KEY", new C34258OooO0oo());
    }

    public final Object readObject() throws IOException {
        String line;
        oOO00O00.OooO0O0 oooO0O0;
        String strSubstring;
        int iIndexOf;
        String line2;
        do {
            line = readLine();
            if (line == null) {
                break;
            }
        } while (!line.startsWith("-----BEGIN "));
        if (line == null || (iIndexOf = (strSubstring = line.substring(11)).indexOf(45)) <= 0 || !strSubstring.endsWith("-----") || strSubstring.length() - iIndexOf != 5) {
            oooO0O0 = null;
        } else {
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("-----END ", strSubstring2);
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList arrayList = new ArrayList();
            while (true) {
                line2 = readLine();
                if (line2 == null) {
                    break;
                }
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 >= 0) {
                    String strSubstring3 = line2.substring(0, iIndexOf2);
                    String strTrim = line2.substring(iIndexOf2 + 1).trim();
                    oOO00O00.OooO00o oooO00o = new oOO00O00.OooO00o();
                    oooO00o.f123278OooO00o = strSubstring3;
                    oooO00o.f123279OooO0O0 = strTrim;
                    arrayList.add(oooO00o);
                } else {
                    if (line2.indexOf(strOooO00o) != -1) {
                        break;
                    }
                    stringBuffer.append(line2.trim());
                }
            }
            if (line2 == null) {
                throw new IOException(C21111o0ooOoO.OooO0Oo(strOooO00o, " not found"));
            }
            String string = stringBuffer.toString();
            C34339OooO0O0 c34339OooO0O0 = C34338OooO00o.f123267OooO00o;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((string.length() / 4) * 3);
            try {
                C34338OooO00o.f123267OooO00o.OooO00o(string, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                oooO0O0 = new oOO00O00.OooO0O0();
                oooO0O0.f123281OooO00o = strSubstring2;
                oooO0O0.f123282OooO0O0 = Collections.unmodifiableList(arrayList);
                oooO0O0.f123283OooO0OO = byteArray;
            } catch (Exception e) {
                throw new C34340OooO0OO(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("unable to decode base64 string: ")), e);
            }
        }
        if (oooO0O0 == null) {
            return null;
        }
        HashMap map = this.f123006OooOo0o;
        String str = oooO0O0.f123281OooO00o;
        Object obj = map.get(str);
        if (obj != null) {
            return ((oOO00O00.OooO0OO) obj).OooO00o(oooO0O0);
        }
        throw new IOException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("unrecognised object: ", str));
    }
}
