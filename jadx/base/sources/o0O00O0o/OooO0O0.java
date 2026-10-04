package o0O00O0o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import androidx.fragment.app.C21904OooOoo0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.hihonor.honorid.core.data.DeviceInfo;
import com.hihonor.honorid.core.data.HonorAccount;
import com.hihonor.honorid.core.data.TmemberRight;
import com.hihonor.honorid.core.data.UserAccountInfo;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.OooOO0O;
import oO0O0Oo0.C32692Oooo0o0;
import oO0OOOo.C32992OooOO0O;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0OooO.C33467OooOOo0;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o000.C33538OooO0OO;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33542OooO0oo;
import oO0o0OO.AbstractC33602OooO00o;
import oO0o0Ooo.C33826OooO0oO;
import oOO00Ooo.C34364OooO00o;
import oOO00o0.C34370OooO0o0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes8.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f88147OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f88148OooO0O0 = 0;

    public static ArrayList OooO00o(XmlPullParser xmlPullParser, Context context) throws XmlPullParserException, IOException {
        C34370OooO0o0.OooO0Oo("SDKAccountXmlImpl", "sdkaccount xml parseAccountsFromXml Start");
        int eventType = xmlPullParser.getEventType();
        ArrayList arrayList = new ArrayList();
        HonorAccount honorAccount = new HonorAccount();
        while (1 != eventType) {
            String name = xmlPullParser.getName();
            if (eventType == 2) {
                if ("account".equals(name)) {
                    String attributeValue = xmlPullParser.getAttributeValue("", RemoteConfigConstants.RequestFieldKey.APP_ID);
                    if (TextUtils.isEmpty(attributeValue)) {
                        C34370OooO0o0.OooO0o0("SDKAccountXmlImpl", "sdk authTokenType is null");
                        attributeValue = context != null ? context.getPackageName() : "";
                    }
                    honorAccount.f68853OooOo = attributeValue;
                } else if ("accountName".equals(name)) {
                    honorAccount.f68855OooOoO = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if (TmemberRight.TAG_USERID.equals(name)) {
                    honorAccount.f68857OooOoOO = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if (TmemberRight.TAG_DEVICEID.equals(name)) {
                    honorAccount.f68860OooOooO = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if ("subDeviceId".equals(name)) {
                    honorAccount.f68861OooOooo = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if ("deviceType".equals(name)) {
                    honorAccount.f68864Oooo000 = xmlPullParser.nextText();
                } else if ("serviceToken".equals(name)) {
                    honorAccount.f68856OooOoO0 = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if ("siteId".equals(name)) {
                    try {
                        honorAccount.f68859OooOoo0 = Integer.parseInt(xmlPullParser.nextText());
                    } catch (NumberFormatException unused) {
                        C34370OooO0o0.OooO0o("SDKAccountXmlImpl", "NumberFormatException: read accounts.xml parseInt error");
                    } catch (Exception unused2) {
                        C34370OooO0o0.OooO0o("SDKAccountXmlImpl", "sdk read accounts.xml parseInt error");
                    }
                } else if (UserAccountInfo.TAG_ACCOUNT_TYPE.equals(name)) {
                    honorAccount.f68865Oooo00O = xmlPullParser.nextText();
                } else if ("loginUserName".equals(name)) {
                    honorAccount.f68866Oooo00o = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if ("countryIsoCode".equals(name)) {
                    honorAccount.f68863Oooo0 = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if (CommonConstant.KEY_SERVICE_COUNTRY_CODE.equals(name)) {
                    honorAccount.f68868Oooo0OO = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if (DeviceInfo.TAG_UUID.equals(name)) {
                    honorAccount.f68870Oooo0o0 = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if ("as_server_domain".equals(name)) {
                    String strOooO00o = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                    honorAccount.f68869Oooo0o = o0O00O0.OooO00o.OooO0o0(strOooO00o) ? strOooO00o : "";
                } else if ("cas_server_domain".equals(name)) {
                    String strOooO00o2 = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                    honorAccount.f68871Oooo0oO = o0O00O0.OooO00o.OooO0o0(strOooO00o2) ? strOooO00o2 : "";
                } else if ("siteDomain".equals(name)) {
                    String strOooO00o3 = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                    honorAccount.f68876OoooO0O = o0O00O0.OooO00o.OooO0o0(strOooO00o3) ? strOooO00o3 : "";
                } else if (CommonConstant.KEY_HOME_ZONE.equals(name)) {
                    try {
                        honorAccount.f68873OoooO = Integer.parseInt(o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText()));
                    } catch (NumberFormatException unused3) {
                        C34370OooO0o0.OooO0o("SDKAccountXmlImpl", "NumberFormatException: read accounts.xml parseInt error");
                    } catch (Exception unused4) {
                        C34370OooO0o0.OooO0o("SDKAccountXmlImpl", "sdk read accounts.xml parseInt error");
                    }
                }
            } else if (eventType == 3 && "account".equals(name)) {
                C34370OooO0o0.OooO0Oo("SDKAccountXmlImpl", "parseAccountsFromXml add account:");
                arrayList.add(honorAccount);
                honorAccount = new HonorAccount();
            }
            eventType = xmlPullParser.next();
        }
        return arrayList;
    }

    public static void OooO0O0(Context context, ArrayList arrayList) {
        List list;
        if (arrayList.isEmpty()) {
            list = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HonorAccount honorAccount = (HonorAccount) it.next();
                if (!o0O00O0.OooO00o.OooO0O0(honorAccount)) {
                    arrayList2.add(honorAccount);
                }
            }
            try {
                if (!arrayList2.isEmpty() && arrayList.containsAll(arrayList2)) {
                    arrayList.removeAll(arrayList2);
                }
            } catch (Exception unused) {
                C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "Exception");
            }
            list = arrayList;
        }
        if (list == null || list.isEmpty() || arrayList.isEmpty()) {
            C34370OooO0o0.OooO0Oo("SDKAccountXmlImpl", "write accounts into file error");
            return;
        }
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                xmlSerializerNewSerializer.setOutput(stringWriter);
                                xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                                xmlSerializerNewSerializer.startTag("", "accounts");
                                xmlSerializerNewSerializer.attribute("", "size", arrayList.size() + "");
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    OooO0OO(context, (HonorAccount) it2.next(), xmlSerializerNewSerializer);
                                }
                                xmlSerializerNewSerializer.endTag("", "accounts");
                                xmlSerializerNewSerializer.endDocument();
                                boolean zOooO0o0 = C34364OooO00o.OooO0o0(context.getFilesDir().getCanonicalPath() + "/", o0O00O0.OooO00o.OooO0OO(stringWriter.toString()));
                                C34370OooO0o0.OooO0Oo("SDKAccountXmlImpl", "write accounts into file :" + zOooO0o0);
                                if (zOooO0o0) {
                                    C34364OooO00o.OooO0o(context, String.valueOf(3));
                                }
                                stringWriter.close();
                            } catch (RuntimeException unused2) {
                                C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "RuntimeException write accounts failed!");
                                stringWriter.close();
                            }
                        } catch (Exception unused3) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "Exception write accounts failed!");
                            stringWriter.close();
                        }
                    } catch (IllegalArgumentException unused4) {
                        C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IllegalArgumentException write accounts failed!");
                        stringWriter.close();
                    }
                } catch (IOException unused5) {
                    C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException ");
                }
            } catch (IOException unused6) {
                C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException write accounts failed!");
                stringWriter.close();
            } catch (IllegalStateException unused7) {
                C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IllegalStateException write accounts failed!");
                stringWriter.close();
            }
        } catch (Throwable th) {
            try {
                stringWriter.close();
            } catch (IOException unused8) {
                C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException ");
            }
            throw th;
        }
    }

    public static void OooO0OO(Context context, HonorAccount honorAccount, XmlSerializer xmlSerializer) throws IOException {
        C34370OooO0o0.OooO0Oo("SDKAccountXmlImpl", "SDKAccountXmlImpl start.");
        if (honorAccount == null) {
            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "account is null.");
            return;
        }
        xmlSerializer.startTag("", "account");
        xmlSerializer.attribute("", RemoteConfigConstants.RequestFieldKey.APP_ID, honorAccount.f68853OooOo);
        C34364OooO00o.OooO0OO(xmlSerializer, "accountName", o0O00.OooO00o.OooO0O0(context, honorAccount.f68855OooOoO));
        C34364OooO00o.OooO0OO(xmlSerializer, TmemberRight.TAG_USERID, o0O00.OooO00o.OooO0O0(context, honorAccount.f68857OooOoOO));
        String strOooO0O0 = o0O00.OooO00o.OooO0O0(context, honorAccount.f68860OooOooO);
        if (strOooO0O0 == null) {
            strOooO0O0 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, TmemberRight.TAG_DEVICEID, strOooO0O0);
        String strOooO0O02 = o0O00.OooO00o.OooO0O0(context, honorAccount.f68861OooOooo);
        if (strOooO0O02 == null) {
            strOooO0O02 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, "subDeviceId", strOooO0O02);
        String str = honorAccount.f68864Oooo000;
        if (str == null) {
            str = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, "deviceType", str);
        C34364OooO00o.OooO0OO(xmlSerializer, "serviceToken", o0O00.OooO00o.OooO0O0(context, honorAccount.f68856OooOoO0));
        C34364OooO00o.OooO0OO(xmlSerializer, "loginUserName", o0O00.OooO00o.OooO0O0(context, honorAccount.f68866Oooo00o));
        C34364OooO00o.OooO0OO(xmlSerializer, "countryIsoCode", o0O00.OooO00o.OooO0O0(context, honorAccount.f68863Oooo0));
        C34364OooO00o.OooO0OO(xmlSerializer, "siteId", honorAccount.f68859OooOoo0 + "");
        String str2 = honorAccount.f68865Oooo00O;
        if (str2 == null) {
            str2 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, UserAccountInfo.TAG_ACCOUNT_TYPE, str2);
        String strOooO0O03 = o0O00.OooO00o.OooO0O0(context, TextUtils.isEmpty(honorAccount.f68868Oooo0OO) ? "" : honorAccount.f68868Oooo0OO);
        if (strOooO0O03 == null) {
            strOooO0O03 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, CommonConstant.KEY_SERVICE_COUNTRY_CODE, strOooO0O03);
        String strOooO0O04 = o0O00.OooO00o.OooO0O0(context, honorAccount.f68870Oooo0o0);
        if (strOooO0O04 == null) {
            strOooO0O04 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, DeviceInfo.TAG_UUID, strOooO0O04);
        String strOooO0O05 = honorAccount.f68869Oooo0o;
        if (!TextUtils.isEmpty(strOooO0O05)) {
            strOooO0O05 = o0O00.OooO00o.OooO0O0(context, strOooO0O05);
        }
        if (TextUtils.isEmpty(strOooO0O05)) {
            strOooO0O05 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, "as_server_domain", strOooO0O05);
        String strOooO0O06 = honorAccount.f68871Oooo0oO;
        if (!TextUtils.isEmpty(strOooO0O06)) {
            strOooO0O06 = o0O00.OooO00o.OooO0O0(context, strOooO0O06);
        }
        if (TextUtils.isEmpty(strOooO0O06)) {
            strOooO0O06 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, "cas_server_domain", strOooO0O06);
        String strOooO0O07 = honorAccount.f68876OoooO0O;
        if (!TextUtils.isEmpty(strOooO0O07)) {
            strOooO0O07 = o0O00.OooO00o.OooO0O0(context, strOooO0O07);
        }
        if (TextUtils.isEmpty(strOooO0O07)) {
            strOooO0O07 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, "siteDomain", strOooO0O07);
        C34364OooO00o.OooO0OO(xmlSerializer, CommonConstant.KEY_HOME_ZONE, o0O00.OooO00o.OooO0O0(context, honorAccount.f68873OoooO + "") + "");
        String str3 = honorAccount.f68872Oooo0oo;
        if (str3 == null) {
            str3 = "0";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        C34364OooO00o.OooO0OO(xmlSerializer, "lastUpdateTime", str3);
        xmlSerializer.endTag("", "account");
    }

    public static final InterfaceC33541OooO0oO OooO0Oo(InterfaceC33541OooO0oO receiver, HashSet hashSet) {
        InterfaceC33541OooO0oO interfaceC33541OooO0oOOooO0Oo;
        C33467OooOOo0 c33467OooOOo0 = C33467OooOOo0.f120936OooO00o;
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O0OoOo0 = c33467OooOOo0.o0OoOo0(receiver);
        if (!hashSet.add(interfaceC33342OoooOo0O0OoOo0)) {
            return null;
        }
        InterfaceC32637OoooOoo interfaceC32637OoooOooOooOOo0 = InterfaceC33452OooO0O0.OooO00o.OooOOo0(interfaceC33342OoooOo0O0OoOo0);
        if (interfaceC32637OoooOooOooOOo0 != null) {
            if (!(interfaceC32637OoooOooOooOOo0 instanceof InterfaceC32637OoooOoo)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(interfaceC32637OoooOooOooOOo0);
                sb.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC32637OoooOooOooOOo0.getClass(), sb).toString());
            }
            InterfaceC33541OooO0oO interfaceC33541OooO0oOOooO0o = C33538OooO0OO.OooO0o(interfaceC32637OoooOooOooOOo0);
            InterfaceC33541OooO0oO interfaceC33541OooO0oOOooO0Oo2 = OooO0Oo(interfaceC33541OooO0oOOooO0o, hashSet);
            if (interfaceC33541OooO0oOOooO0Oo2 != null) {
                return ((interfaceC33541OooO0oOOooO0Oo2 instanceof InterfaceC33542OooO0oo) && InterfaceC33452OooO0O0.OooO00o.Oooo00o((InterfaceC33542OooO0oo) interfaceC33541OooO0oOOooO0Oo2) && InterfaceC33452OooO0O0.OooO00o.Oooo00O(receiver) && (InterfaceC33452OooO0O0.OooO00o.OooOoo0(c33467OooOOo0.o0OoOo0(interfaceC33541OooO0oOOooO0o)) || ((interfaceC33541OooO0oOOooO0o instanceof InterfaceC33542OooO0oo) && InterfaceC33452OooO0O0.OooO00o.Oooo00o((InterfaceC33542OooO0oo) interfaceC33541OooO0oOOooO0o)))) ? c33467OooOOo0.o00O0O(interfaceC33541OooO0oOOooO0o) : (!InterfaceC33452OooO0O0.OooO00o.Oooo00O(interfaceC33541OooO0oOOooO0Oo2) && (receiver instanceof InterfaceC33542OooO0oo) && InterfaceC33452OooO0O0.OooO00o.OooOooo((InterfaceC33542OooO0oo) receiver)) ? c33467OooOOo0.o00O0O(interfaceC33541OooO0oOOooO0Oo2) : interfaceC33541OooO0oOOooO0Oo2;
            }
            return null;
        }
        if (InterfaceC33452OooO0O0.OooO00o.OooOoo0(interfaceC33342OoooOo0O0OoOo0)) {
            OooOOO0.OooO0oO(receiver, "$receiver");
            if (!(receiver instanceof AbstractC33320OooOoo)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, receiver.getClass(), sb2).toString());
            }
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0o = C32992OooOO0O.OooO0o((AbstractC33320OooOoo) receiver);
            if (abstractC33328Oooo0O0OooO0o == null || (interfaceC33541OooO0oOOooO0Oo = OooO0Oo(abstractC33328Oooo0O0OooO0o, hashSet)) == null) {
                return null;
            }
            if (!InterfaceC33452OooO0O0.OooO00o.Oooo00O(receiver)) {
                return interfaceC33541OooO0oOOooO0Oo;
            }
            if (!InterfaceC33452OooO0O0.OooO00o.Oooo00O(interfaceC33541OooO0oOOooO0Oo) && (!(interfaceC33541OooO0oOOooO0Oo instanceof InterfaceC33542OooO0oo) || !InterfaceC33452OooO0O0.OooO00o.Oooo00o((InterfaceC33542OooO0oo) interfaceC33541OooO0oOOooO0Oo))) {
                return c33467OooOOo0.o00O0O(interfaceC33541OooO0oOOooO0Oo);
            }
        }
        return receiver;
    }

    public static final InterfaceC32596OooO0o0 OooO0o(C32692Oooo0o0 c32692Oooo0o0, C33477OooO0OO fqName) {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO;
        OooOO0 oooOO0OooOooo;
        oOo0o0oO.OooO0O0 oooO0O0 = oOo0o0oO.OooO0O0.f123886OooOo0o;
        OooOOO0.OooO0oO(c32692Oooo0o0, "<this>");
        OooOOO0.OooO0oO(fqName, "fqName");
        if (!fqName.OooO0Oo()) {
            C33477OooO0OO c33477OooO0OOOooO0o0 = fqName.OooO0o0();
            OooOOO0.OooO0o(c33477OooO0OOOooO0o0, "fqName.parent()");
            OooOO0 oooOO0OooOOO0 = c32692Oooo0o0.o00oO0o(c33477OooO0OOOooO0o0).OooOOO0();
            C33479OooO0o c33479OooO0oOooO0o = fqName.OooO0o();
            OooOOO0.OooO0o(c33479OooO0oOooO0o, "fqName.shortName()");
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO2 = ((oO0Oo0o0.OooO00o) oooOO0OooOOO0).OooO0oO(c33479OooO0oOooO0o, oooO0O0);
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0oO2 instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO2 : null;
            if (interfaceC32596OooO0o0 != null) {
                return interfaceC32596OooO0o0;
            }
            C33477OooO0OO c33477OooO0OOOooO0o02 = fqName.OooO0o0();
            OooOOO0.OooO0o(c33477OooO0OOOooO0o02, "fqName.parent()");
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO0o = OooO0o(c32692Oooo0o0, c33477OooO0OOOooO0o02);
            if (interfaceC32596OooO0o0OooO0o == null || (oooOO0OooOooo = interfaceC32596OooO0o0OooO0o.OooOooo()) == null) {
                interfaceC32598OooO0ooOooO0oO = null;
            } else {
                C33479OooO0o c33479OooO0oOooO0o2 = fqName.OooO0o();
                OooOOO0.OooO0o(c33479OooO0oOooO0o2, "fqName.shortName()");
                interfaceC32598OooO0ooOooO0oO = oooOO0OooOooo.OooO0oO(c33479OooO0oOooO0o2, oooO0O0);
            }
            if (interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32596OooO0o0) {
                return (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO;
            }
        }
        return null;
    }

    public static final InterfaceC32598OooO0oo OooO0o0(OooOO0O oooOO0O) {
        OooOOO0.OooO0oO(oooOO0O, "<this>");
        OooOO0O oooOO0OOooO0Oo = oooOO0O.OooO0Oo();
        if (oooOO0OOooO0Oo == null || (oooOO0O instanceof InterfaceC32620Oooo00O)) {
            return null;
        }
        if (!(oooOO0OOooO0Oo.OooO0Oo() instanceof InterfaceC32620Oooo00O)) {
            return OooO0o0(oooOO0OOooO0Oo);
        }
        if (oooOO0OOooO0Oo instanceof InterfaceC32598OooO0oo) {
            return (InterfaceC32598OooO0oo) oooOO0OOooO0Oo;
        }
        return null;
    }

    public static final void OooO0oO(Continuation continuation, AbstractC33602OooO00o abstractC33602OooO00o) {
        try {
            C33826OooO0oO.OooO00o(C32460OooOooO.f116667OooO00o, C21904OooOoo0.OooO0o0(continuation));
        } catch (Throwable th) {
            abstractC33602OooO00o.resumeWith(C32446OooOOOo.OooO00o(th));
            throw th;
        }
    }
}
