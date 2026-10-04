package oOO00o00;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.hihonor.honorid.core.data.HonorAccount;
import com.hihonor.honorid.core.data.TmemberRight;
import com.hihonor.honorid.core.data.UserAccountInfo;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import oOO00Ooo.C34364OooO00o;
import oOO00Ooo.C34365OooO0O0;
import oOO00o0.C34370OooO0o0;
import oOO00o0O.C34375OooO00o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: oOO00o00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34374OooO0Oo implements InterfaceC34371OooO00o {
    public static ArrayList OooO0O0(XmlPullParser xmlPullParser, Context context) throws XmlPullParserException, IOException {
        C34370OooO0o0.OooO0o0("XmlFileGrade", "parseAccountsFromXml Start");
        int eventType = xmlPullParser.getEventType();
        ArrayList arrayList = new ArrayList();
        HonorAccount honorAccount = new HonorAccount();
        while (1 != eventType) {
            String name = xmlPullParser.getName();
            if (eventType != 0) {
                if (eventType != 2) {
                    if (eventType != 3) {
                        C34370OooO0o0.OooO0o0("XmlFileGrade", "default");
                    } else if ("account".equals(name)) {
                        C34370OooO0o0.OooO0o0("XmlFileGrade", "parseAccountsFromXml account add ");
                        if (TextUtils.isEmpty(honorAccount.f68855OooOoO)) {
                            C34370OooO0o0.OooO0Oo("XmlFileGrade", "Invalid account , not need add.");
                        } else {
                            arrayList.add(honorAccount);
                        }
                        honorAccount = new HonorAccount();
                    }
                } else if ("account".equals(name)) {
                    String attributeValue = xmlPullParser.getAttributeValue("", RemoteConfigConstants.RequestFieldKey.APP_ID);
                    if (TextUtils.isEmpty(attributeValue)) {
                        C34370OooO0o0.OooO0o0("XmlFileGrade", "authTokenType is null");
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
                        C34370OooO0o0.OooO0o("XmlFileGrade", "NumberFormatException: read accounts.xml parseInt error");
                    } catch (Exception unused2) {
                        C34370OooO0o0.OooO0o("XmlFileGrade", "read accounts.xml parseInt error");
                    }
                } else if (UserAccountInfo.TAG_ACCOUNT_TYPE.equals(name)) {
                    honorAccount.f68865Oooo00O = xmlPullParser.nextText();
                } else if ("loginUserName".equals(name)) {
                    honorAccount.f68866Oooo00o = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                } else if ("countryIsoCode".equals(name)) {
                    honorAccount.f68863Oooo0 = o0O00.OooO00o.OooO00o(context, xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // oOO00o00.InterfaceC34371OooO00o
    public final void OooO00o(Context context, int i) throws Throwable {
        ?? r2;
        ?? r1;
        ArrayList arrayList;
        ?? IsEmpty = "XmlFileGrade";
        if (i >= 3) {
            C34370OooO0o0.OooO0OO("XmlFileGrade", "newVersion is less then oldVersion, onUpgrade error");
            return;
        }
        C34370OooO0o0.OooO0Oo("XmlFileGrade", "update HnAccounts.xml when version update");
        C34375OooO00o c34375OooO00oOooO0O0 = C34375OooO00o.OooO0O0(context);
        c34375OooO00oOooO0O0.OooO0OO("last_head_picture_url");
        C34370OooO0o0.OooO0Oo("XmlFileGrade", "delete last_head_picture_url in HonorAccount.xml");
        c34375OooO00oOooO0O0.OooO0OO("DEVID_1");
        C34370OooO0o0.OooO0Oo("XmlFileGrade", "delete DEVID in HonorAccount.xml");
        c34375OooO00oOooO0O0.OooO0OO("SUBDEVID");
        C34370OooO0o0.OooO0Oo("XmlFileGrade", "delete SUBDEVID in HonorAccount.xml");
        c34375OooO00oOooO0O0.OooO0OO("hasEncryptHeadPictureUrl");
        C34370OooO0o0.OooO0Oo("XmlFileGrade", "delete hasEncryptHeadPictureUrl in HonorAccount.xml");
        String strOooO00o = c34375OooO00oOooO0O0.OooO00o(CommonConstant.KEY_ACCESS_TOKEN);
        if (!TextUtils.isEmpty(strOooO00o)) {
            String strOooO00o2 = o0O00.OooO00o.OooO00o(context, strOooO00o);
            if (TextUtils.isEmpty(strOooO00o2)) {
                c34375OooO00oOooO0O0.OooO0OO(CommonConstant.KEY_ACCESS_TOKEN);
                C34370OooO0o0.OooO0Oo("XmlFileGrade", "accessToken ecb decrypt error");
            } else {
                C34370OooO0o0.OooO0Oo("XmlFileGrade", "update accessToken in HonorAccount.xml");
                c34375OooO00oOooO0O0.OooO0Oo(CommonConstant.KEY_ACCESS_TOKEN, strOooO00o2);
            }
        }
        String strOooO00o3 = c34375OooO00oOooO0O0.OooO00o("UUID");
        if (TextUtils.isEmpty(strOooO00o3)) {
            c34375OooO00oOooO0O0.OooO0OO("UUID");
            C34370OooO0o0.OooO0Oo("XmlFileGrade", "uuid ecb decrypt error");
        } else {
            C34370OooO0o0.OooO0Oo("XmlFileGrade", "update uuid in HonorAccount.xml");
            c34375OooO00oOooO0O0.OooO0Oo("UUID", strOooO00o3);
        }
        String packageName = context.getPackageName();
        C34365OooO0O0.OooO00o(context).getClass();
        if (packageName.equals("com.hihonor.id")) {
            return;
        }
        String str = "IOException";
        ?? r22 = 0;
        r22 = 0;
        r22 = 0;
        r22 = 0;
        r22 = 0;
        r22 = 0;
        r22 = 0;
        try {
            try {
                File file = new File(context.getFilesDir().getCanonicalPath() + "/accounts.xml");
                if (file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStream, null);
                        ArrayList arrayListOooO0O0 = OooO0O0(xmlPullParserNewPullParser, context);
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            C34370OooO0o0.OooO0OO("XmlFileGrade", "IOException");
                        }
                        arrayList = arrayListOooO0O0;
                        r22 = arrayListOooO0O0;
                    } catch (FileNotFoundException unused2) {
                        r22 = fileInputStream;
                        C34370OooO0o0.OooO0OO("XmlFileGrade", "readAccountsFromXml FileNotFoundException");
                        arrayList = new ArrayList();
                        if (r22 != 0) {
                            try {
                                r22.close();
                            } catch (IOException unused3) {
                                C34370OooO0o0.OooO0OO("XmlFileGrade", "IOException");
                            }
                        }
                    } catch (IOException unused4) {
                        r22 = fileInputStream;
                        C34370OooO0o0.OooO0OO("XmlFileGrade", "readAccountsFromXml IOException");
                        arrayList = new ArrayList();
                        if (r22 != 0) {
                            try {
                                r22.close();
                            } catch (IOException unused5) {
                                C34370OooO0o0.OooO0OO("XmlFileGrade", "IOException");
                            }
                        }
                    } catch (RuntimeException unused6) {
                        r22 = fileInputStream;
                        C34370OooO0o0.OooO0OO("XmlFileGrade", "readAccountsFromXml RuntimeException");
                        arrayList = new ArrayList();
                        if (r22 != 0) {
                            try {
                                r22.close();
                            } catch (IOException unused7) {
                                C34370OooO0o0.OooO0OO("XmlFileGrade", "IOException");
                            }
                        }
                    } catch (XmlPullParserException unused8) {
                        r22 = fileInputStream;
                        C34370OooO0o0.OooO0OO("XmlFileGrade", "XmlPullParserException readAccountsFromXmlfailed!");
                        arrayList = new ArrayList();
                        if (r22 != 0) {
                            try {
                                r22.close();
                            } catch (IOException unused9) {
                                C34370OooO0o0.OooO0OO("XmlFileGrade", "IOException");
                            }
                        }
                    } catch (Exception unused10) {
                        r22 = fileInputStream;
                        C34370OooO0o0.OooO0OO("XmlFileGrade", "readAccountsFromXml Exception");
                        arrayList = new ArrayList();
                        if (r22 != 0) {
                            try {
                                r22.close();
                            } catch (IOException unused11) {
                                C34370OooO0o0.OooO0OO("XmlFileGrade", "IOException");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r2 = fileInputStream;
                        r1 = IsEmpty;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (IOException unused12) {
                                C34370OooO0o0.OooO0OO(r1, str);
                            }
                        }
                        throw th;
                    }
                } else {
                    C34370OooO0o0.OooO0Oo("XmlFileGrade", "xmlfilegradle sdk filepath not exist");
                    arrayList = new ArrayList();
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = IsEmpty;
                r2 = r22;
            }
        } catch (FileNotFoundException unused13) {
        } catch (IOException unused14) {
        } catch (RuntimeException unused15) {
        } catch (XmlPullParserException unused16) {
        } catch (Exception unused17) {
        }
        FileOutputStream fileOutputStream = C34364OooO00o.f123341OooO00o;
        str = "accounts.xml";
        IsEmpty = TextUtils.isEmpty("accounts.xml");
        if (IsEmpty == 0) {
            C34364OooO00o.OooO0Oo(new File(context.getFilesDir(), "accounts.xml"));
        }
        o0O00O0o.OooO0O0.OooO0O0(context, arrayList);
    }
}
