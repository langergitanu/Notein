package o0OoOoOo;

import OooOOO0.AbstractC20449OooO0Oo;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Xml;
import com.google.firebase.messaging.Constants;
import com.hihonor.cloudservice.framework.aidl.DataBuffer;
import com.hihonor.cloudservice.support.account.result.SignInAccountInfo;
import com.hihonor.honorid.core.data.HonorAccount;
import com.hihonor.honorid.core.helper.handler.ErrorStatus;
import com.hihonor.honorid.usecase.WriteHnAccountUseCase;
import com.huawei.hms.network.embedded.C18345s1;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import o00OO0.OooO0OO;
import o0O000.OooO00o;
import o0OoOoOO.C29213OooO00o;
import oOO00Ooo.C34367OooO0Oo;
import oOO00o0.C34370OooO0o0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o0OoOoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractBinderC29214OooO00o extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws Throwable {
        o0O000oo.OooO0O0 oooO0O0;
        FileInputStream fileInputStream;
        Object arrayList;
        ?? arrayList2;
        File file;
        if (i != 1) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.hihonor.cloudservice.framework.aidl.IServiceCallback");
            return true;
        }
        parcel.enforceInterface("com.hihonor.cloudservice.framework.aidl.IServiceCallback");
        ?? r12 = 0;
        DataBuffer dataBufferCreateFromParcel = parcel.readInt() != 0 ? DataBuffer.CREATOR.createFromParcel(parcel) : null;
        OooO00o.BinderC19720OooO00o binderC19720OooO00o = (OooO00o.BinderC19720OooO00o) this;
        C34370OooO0o0.OooO0Oo("SilentLoginTask", "onResult");
        if (o0O000.OooO00o.this.f123376OooOo.get()) {
            C34370OooO0o0.OooO0Oo("SilentLoginTask", "has cancelled by timeout, return directly");
            return true;
        }
        o0O000.OooO00o.this.OooO0OO();
        Bundle bundle = dataBufferCreateFromParcel.f68816OooOoO;
        bundle.setClassLoader(o0O000.OooO00o.this.f88113OooOoo.getClassLoader() == null ? OooO00o.BinderC19720OooO00o.class.getClassLoader() : o0O000.OooO00o.this.f88113OooOoo.getClassLoader());
        int i3 = bundle.getInt(C18345s1.f56073g);
        C34370OooO0o0.OooO0Oo("SilentLoginTask", "execute : onResult retCode = " + i3);
        if (i3 != 0) {
            if (i3 == 2002) {
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(55, "scopes not authorize"));
                return true;
            }
            if (i3 == 2001) {
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(31, "Account hasnot login"));
                return true;
            }
            if (i3 == 1) {
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(29, "Signature invalid"));
                return true;
            }
            if (i3 == 2) {
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(30, "serviceToken invalid"));
                return true;
            }
            if (i3 != 2009) {
                if (i3 == 2004) {
                    o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(2004, "password verification required"));
                    return true;
                }
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(i3, ""));
                return true;
            }
            Bundle extras = ((Intent) bundle.getParcelable(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getExtras();
            String string = "";
            int i4 = 56;
            if (extras != null) {
                i4 = extras.getInt("err_code", 56);
                string = extras.getString("server_err_desc", "access server return error");
            }
            C34370OooO0o0.OooO0OO("SilentLoginTask", "loginResult : errCode = " + i4 + " errMsg = " + string);
            if (1101 == i4) {
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(67, string));
                return true;
            }
            if (1202 == i4) {
                o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(68, string));
                return true;
            }
            o0O000.OooO00o.this.f88114OooOoo0.OooO00o(new ErrorStatus(i4, string));
            return true;
        }
        Bundle extras2 = ((Intent) bundle.getParcelable(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)).getExtras();
        HonorAccount honorAccount = new HonorAccount();
        honorAccount.OooO00o(extras2);
        o0O000.OooO00o oooO00o = o0O000.OooO00o.this;
        oooO00o.getClass();
        String str = honorAccount.f68870Oooo0o0;
        if (TextUtils.isEmpty(str) || CloudMetaExtra.DEFINE_NON_PARENT_ID.equalsIgnoreCase(str)) {
            String strOooO00o = C34367OooO0Oo.OooO00o(oooO00o.f88113OooOoo, 0);
            if (strOooO00o == null) {
                strOooO00o = "";
            }
            honorAccount.f68870Oooo0o0 = strOooO00o;
        }
        o0O00O.OooO00o.OooO00o(o0O000.OooO00o.this.f88113OooOoo).OooO0O0(honorAccount);
        o0O00O.OooO00o OooO00o2 = o0O00O.OooO00o.OooO00o(o0O000.OooO00o.this.f88113OooOoo);
        if (OooO00o2.f88145OooO0O0 == null) {
            C34370OooO0o0.OooO0Oo("HnIDMemCache", "initHnAccountMemCache");
            Context context = OooO00o2.f88144OooO00o;
            AbstractC20449OooO0Oo.OooO0o0(context).getClass();
            Object obj = "/accounts.xml";
            C34370OooO0o0.OooO0Oo("SDKAccountManager", "MemCache has no account,parse from file");
            try {
                try {
                    file = new File(context.getFilesDir().getCanonicalPath() + "/accounts.xml");
                } catch (Throwable th) {
                    th = th;
                    r12 = obj;
                    if (r12 != 0) {
                        try {
                            r12.close();
                        } catch (IOException unused) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                fileInputStream = null;
            } catch (IOException unused3) {
                fileInputStream = null;
            } catch (RuntimeException unused4) {
                fileInputStream = null;
            } catch (XmlPullParserException unused5) {
                fileInputStream = null;
            } catch (Exception unused6) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (r12 != 0) {
                }
                throw th;
            }
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStream, null);
                    arrayList = o0O00O0o.OooO0O0.OooO00o(xmlPullParserNewPullParser, context);
                    try {
                        fileInputStream.close();
                    } catch (IOException unused7) {
                        C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                    }
                } catch (FileNotFoundException unused8) {
                    C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "FileNotFoundException read xml failed!");
                    arrayList = new ArrayList();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused9) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                        }
                    }
                } catch (IOException unused10) {
                    C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException read xml failed!");
                    arrayList = new ArrayList();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused11) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                        }
                    }
                } catch (RuntimeException unused12) {
                    C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "RuntimeException read xml failed!");
                    arrayList = new ArrayList();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused13) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                        }
                    }
                } catch (XmlPullParserException unused14) {
                    C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "XmlPullParserException read xml failed!");
                    arrayList = new ArrayList();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused15) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                        }
                    }
                } catch (Exception unused16) {
                    C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "Exception read xml failed!");
                    arrayList = new ArrayList();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused17) {
                            C34370OooO0o0.OooO0OO("SDKAccountXmlImpl", "IOException  ");
                        }
                    }
                }
                obj = arrayList;
                arrayList2 = obj;
                if (!arrayList2.isEmpty()) {
                }
                if (arrayList2.size() <= 0) {
                }
            } else {
                C34370OooO0o0.OooO0Oo("SDKAccountXmlImpl", " sdk filepath not exist");
                arrayList2 = new ArrayList();
                if (!arrayList2.isEmpty()) {
                    o0O00O.OooO00o.OooO00o(context).OooO0O0((HonorAccount) arrayList2.get(0));
                }
                if (arrayList2.size() <= 0) {
                    OooO00o2.f88145OooO0O0 = (HonorAccount) arrayList2.get(0);
                } else {
                    C34370OooO0o0.OooO0Oo("HnIDMemCache", "file has no account");
                }
            }
        }
        HonorAccount honorAccount2 = OooO00o2.f88145OooO0O0;
        C29213OooO00o c29213OooO00o = o0O000.OooO00o.this.f88114OooOoo0;
        if (c29213OooO00o != null && honorAccount2 != null) {
            String str2 = honorAccount2.f68874OoooO0;
            String str3 = honorAccount2.f68875OoooO00;
            String str4 = honorAccount2.f68879o000oOoO;
            String str5 = honorAccount2.f68878OoooOOO;
            SignInAccountInfo signInAccountInfo = new SignInAccountInfo();
            signInAccountInfo.f68834OooOoo = new HashSet();
            signInAccountInfo.f68830OooOo0o = str2;
            signInAccountInfo.f68829OooOo = "";
            signInAccountInfo.f68832OooOoO0 = null;
            signInAccountInfo.f68831OooOoO = str3;
            signInAccountInfo.f68833OooOoOO = str4;
            signInAccountInfo.f68836OooOooO = str5;
            c29213OooO00o.f103599OooO00o.OooO0OO(signInAccountInfo);
        }
        o0O00O0o.OooO00o oooO00oOooO0o0 = AbstractC20449OooO0Oo.OooO0o0(o0O000.OooO00o.this.f88113OooOoo);
        Context context2 = o0O000.OooO00o.this.f88113OooOoo;
        oooO00oOooO0o0.getClass();
        if (o0O00O0.OooO00o.OooO0O0(honorAccount)) {
            o0O00O.OooO00o.OooO00o(context2).OooO0O0(honorAccount);
            ArrayList<HonorAccount> arrayList3 = new ArrayList<>();
            arrayList3.add(honorAccount);
            LinkedBlockingQueue linkedBlockingQueue = o0O000oo.OooO0O0.f88137OooO0O0;
            synchronized (o0O000oo.OooO0O0.class) {
                try {
                    if (o0O000oo.OooO0O0.f88140OooO0o0 == null) {
                        o0O000oo.OooO0O0.f88140OooO0o0 = new o0O000oo.OooO0O0();
                    }
                    oooO0O0 = o0O000oo.OooO0O0.f88140OooO0o0;
                } finally {
                }
            }
            WriteHnAccountUseCase writeHnAccountUseCase = new WriteHnAccountUseCase();
            writeHnAccountUseCase.f68955OooO00o = context2;
            writeHnAccountUseCase.f68956OooO0O0 = arrayList3;
            new WriteHnAccountUseCase.RequestValues().f68957OooOo0o = honorAccount.f68855OooOoO;
            OooO0OO oooO0OO = new OooO0OO();
            oooO0OO.f84715OooOo = writeHnAccountUseCase;
            oooO0O0.f88141OooO00o.execute(oooO0OO);
        } else {
            C34370OooO0o0.OooO0Oo("SDKAccountManager", "the account is invalid , cannot be added into file");
        }
        return true;
    }
}
