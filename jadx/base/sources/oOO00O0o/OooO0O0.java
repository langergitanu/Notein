package oOO00O0o;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import com.aspose.words.WarningType;
import com.huawei.hms.network.embedded.C18101a5;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.MainActivity;
import java.io.File;
import java.util.StringTokenizer;
import o00oO0O.C25493OooOO0o;
import oOO00OO.OooO00o;
import org.opencv.core.Core;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f123286OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f123287OooO0oO = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oOO00OO.OooO00o f123288OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC34350OooO0o0 f123289OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f123290OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public MainActivity f123291OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooO00o f123292OooO0o0;

    public class OooO00o implements ServiceConnection {

        /* JADX INFO: renamed from: oOO00O0o.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C20352OooO00o implements InterfaceC34349OooO0Oo {
            public C20352OooO00o() {
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final void OooO00o() {
                Log.e("OpenCVManager/Helper", "Installation was not started! Nothing to wait!");
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final void OooO0O0() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                Log.d("OpenCVManager/Helper", "Trying to install OpenCV lib via Google Play");
                try {
                    if (oooO0O0.f123288OooO00o.OooOOO(oooO0O0.f123290OooO0OO)) {
                        OooO0O0.f123287OooO0oO = true;
                        Log.d("OpenCVManager/Helper", "Package installation started");
                        Log.d("OpenCVManager/Helper", "Unbind from service");
                        oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                        return;
                    }
                    Log.d("OpenCVManager/Helper", "OpenCV package was not installed!");
                    Log.d("OpenCVManager/Helper", "Init finished with status 2");
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    oooO0O0.f123289OooO0O0.OooO0O0(2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d("OpenCVManager/Helper", "Init finished with status 255");
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    oooO0O0.f123289OooO0O0.OooO0O0(255);
                }
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final void cancel() {
                Log.d("OpenCVManager/Helper", "OpenCV library installation was canceled");
                Log.d("OpenCVManager/Helper", "Init finished with status 3");
                Log.d("OpenCVManager/Helper", "Unbind from service");
                OooO0O0 oooO0O0 = OooO0O0.this;
                oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                Log.d("OpenCVManager/Helper", "Calling using callback");
                oooO0O0.f123289OooO0O0.OooO0O0(3);
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final String getPackageName() {
                return "OpenCV library";
            }
        }

        /* JADX INFO: renamed from: oOO00O0o.OooO0O0$OooO00o$OooO0O0, reason: collision with other inner class name */
        public class C20353OooO0O0 implements InterfaceC34349OooO0Oo {
            public C20353OooO0O0() {
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final void OooO00o() {
                OooO0O0 oooO0O0 = OooO0O0.this;
                Log.d("OpenCVManager/Helper", "Waiting for current installation");
                try {
                    if (oooO0O0.f123288OooO00o.OooOOO(oooO0O0.f123290OooO0OO)) {
                        Log.d("OpenCVManager/Helper", "Waiting for package installation");
                    } else {
                        Log.d("OpenCVManager/Helper", "OpenCV package was not installed!");
                        Log.d("OpenCVManager/Helper", "Init finished with status 2");
                        Log.d("OpenCVManager/Helper", "Calling using callback");
                        oooO0O0.f123289OooO0O0.OooO0O0(2);
                    }
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d("OpenCVManager/Helper", "Init finished with status 255");
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    oooO0O0.f123289OooO0O0.OooO0O0(255);
                }
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final void OooO0O0() {
                Log.e("OpenCVManager/Helper", "Nothing to install we just wait current installation");
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final void cancel() {
                Log.d("OpenCVManager/Helper", "OpenCV library installation was canceled");
                OooO0O0.f123287OooO0oO = false;
                Log.d("OpenCVManager/Helper", "Init finished with status 3");
                Log.d("OpenCVManager/Helper", "Unbind from service");
                OooO0O0 oooO0O0 = OooO0O0.this;
                oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                Log.d("OpenCVManager/Helper", "Calling using callback");
                oooO0O0.f123289OooO0O0.OooO0O0(3);
            }

            @Override // oOO00O0o.InterfaceC34349OooO0Oo
            public final String getPackageName() {
                return "OpenCV library";
            }
        }

        public OooO00o() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            oOO00OO.OooO00o oooO00o;
            Log.d("OpenCVManager/Helper", "Service connection created");
            int i = OooO00o.AbstractBinderC20355OooO00o.f123304OooO0o0;
            if (iBinder == null) {
                oooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("org.opencv.engine.OpenCVEngineInterface");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof oOO00OO.OooO00o)) {
                    OooO00o.AbstractBinderC20355OooO00o.C20356OooO00o c20356OooO00o = new OooO00o.AbstractBinderC20355OooO00o.C20356OooO00o();
                    c20356OooO00o.f123305OooO0o0 = iBinder;
                    oooO00o = c20356OooO00o;
                } else {
                    oooO00o = (oOO00OO.OooO00o) iInterfaceQueryLocalInterface;
                }
            }
            OooO0O0 oooO0O0 = OooO0O0.this;
            oooO0O0.f123288OooO00o = oooO00o;
            if (oooO00o == null) {
                Log.d("OpenCVManager/Helper", "OpenCV Manager Service connection fails. May be service was not installed?");
                OooO0O0.OooO0O0(oooO0O0.f123291OooO0Oo, oooO0O0.f123289OooO0O0);
                return;
            }
            int i2 = 0;
            OooO0O0.f123286OooO0o = false;
            try {
                if (oooO00o.OooOO0o() < 2) {
                    Log.d("OpenCVManager/Helper", "Init finished with status 4");
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    oooO0O0.f123289OooO0O0.OooO0O0(4);
                    return;
                }
                Log.d("OpenCVManager/Helper", "Trying to get library path");
                String strOooO0o0 = oooO0O0.f123288OooO00o.OooO0o0(oooO0O0.f123290OooO0OO);
                if (strOooO0o0 != null && strOooO0o0.length() != 0) {
                    Log.d("OpenCVManager/Helper", "Trying to get library list");
                    OooO0O0.f123287OooO0oO = false;
                    String strOooO = oooO0O0.f123288OooO00o.OooO(oooO0O0.f123290OooO0OO);
                    Log.d("OpenCVManager/Helper", "Library list: \"" + strOooO + "\"");
                    Log.d("OpenCVManager/Helper", "First attempt to load libs");
                    if (OooO0O0.OooO00o(oooO0O0, strOooO0o0, strOooO)) {
                        Log.d("OpenCVManager/Helper", "First attempt to load libs is OK");
                        for (String str : Core.OooO00o().split(System.getProperty(C18101a5.f54156e))) {
                            Log.i("OpenCVManager/Helper", str);
                        }
                    } else {
                        Log.d("OpenCVManager/Helper", "First attempt to load libs fails");
                        i2 = 255;
                    }
                    Log.d("OpenCVManager/Helper", "Init finished with status " + i2);
                    Log.d("OpenCVManager/Helper", "Unbind from service");
                    oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                    Log.d("OpenCVManager/Helper", "Calling using callback");
                    oooO0O0.f123289OooO0O0.OooO0O0(i2);
                    return;
                }
                if (OooO0O0.f123287OooO0oO) {
                    oooO0O0.f123289OooO0O0.OooO00o(1, new C20353OooO0O0());
                } else {
                    oooO0O0.f123289OooO0O0.OooO00o(0, new C20352OooO00o());
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                Log.d("OpenCVManager/Helper", "Init finished with status 255");
                Log.d("OpenCVManager/Helper", "Unbind from service");
                oooO0O0.f123291OooO0Oo.unbindService(oooO0O0.f123292OooO0o0);
                Log.d("OpenCVManager/Helper", "Calling using callback");
                oooO0O0.f123289OooO0O0.OooO0O0(255);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            OooO0O0.this.f123288OooO00o = null;
        }
    }

    public static boolean OooO00o(OooO0O0 oooO0O0, String str, String str2) {
        Log.d("OpenCVManager/Helper", "Trying to init OpenCV libs");
        if (str.length() == 0) {
            Log.d("OpenCVManager/Helper", "Library path \"" + str + "\" is empty");
            return false;
        }
        if (str2 == null || str2.length() == 0) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(str);
            sbOooO0OO.append(File.separator);
            sbOooO0OO.append("libopencv_java4.so");
            return OooO0Oo(sbOooO0OO.toString());
        }
        Log.d("OpenCVManager/Helper", "Trying to load libs by dependency list");
        StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
        boolean zOooO0Oo = true;
        while (stringTokenizer.hasMoreTokens()) {
            StringBuilder sbOooO0OO2 = C22218Oooo.OooO0OO(str);
            sbOooO0OO2.append(File.separator);
            sbOooO0OO2.append(stringTokenizer.nextToken());
            zOooO0Oo &= OooO0Oo(sbOooO0OO2.toString());
        }
        return zOooO0Oo;
    }

    public static void OooO0O0(MainActivity mainActivity, InterfaceC34350OooO0o0 interfaceC34350OooO0o0) {
        if (f123286OooO0o) {
            Log.d("OpenCVManager/Helper", "Waiting current installation process");
            interfaceC34350OooO0o0.OooO00o(1, new C34346OooO00o(mainActivity, interfaceC34350OooO0o0));
        } else {
            Log.d("OpenCVManager/Helper", "Request new service installation");
            interfaceC34350OooO0o0.OooO00o(0, new C25493OooOO0o(mainActivity, interfaceC34350OooO0o0));
        }
    }

    public static boolean OooO0OO(MainActivity mainActivity) {
        try {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=org.opencv.engine"));
            intent.addFlags(WarningType.HINT);
            mainActivity.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean OooO0Oo(String str) {
        Log.d("OpenCVManager/Helper", "Trying to load library " + str);
        try {
            System.load(str);
            Log.d("OpenCVManager/Helper", "OpenCV libs init was ok!");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d("OpenCVManager/Helper", "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }
}
