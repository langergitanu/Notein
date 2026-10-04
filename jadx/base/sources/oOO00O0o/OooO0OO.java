package oOO00O0o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.orion.notein.MainActivity;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO implements InterfaceC34350OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MainActivity f123296OooO00o;

    public class OooO00o implements DialogInterface.OnClickListener {
        public OooO00o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            OooO0OO.this.f123296OooO00o.finish();
        }
    }

    public class OooO0O0 implements DialogInterface.OnClickListener {
        public OooO0O0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            OooO0OO.this.f123296OooO00o.finish();
        }
    }

    /* JADX INFO: renamed from: oOO00O0o.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public class DialogInterfaceOnClickListenerC20354OooO0OO implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC20354OooO0OO() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            OooO0OO.this.f123296OooO00o.finish();
        }
    }

    public class OooO0Oo implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34349OooO0Oo f123300OooOo0o;

        public OooO0Oo(InterfaceC34349OooO0Oo interfaceC34349OooO0Oo) {
            this.f123300OooOo0o = interfaceC34349OooO0Oo;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f123300OooOo0o.OooO0O0();
        }
    }

    public class OooO0o implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34349OooO0Oo f123301OooOo0o;

        public OooO0o(InterfaceC34349OooO0Oo interfaceC34349OooO0Oo) {
            this.f123301OooOo0o = interfaceC34349OooO0Oo;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f123301OooOo0o.OooO00o();
        }
    }

    /* JADX INFO: renamed from: oOO00O0o.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public class DialogInterfaceOnClickListenerC34347OooO0o0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34349OooO0Oo f123302OooOo0o;

        public DialogInterfaceOnClickListenerC34347OooO0o0(InterfaceC34349OooO0Oo interfaceC34349OooO0Oo) {
            this.f123302OooOo0o = interfaceC34349OooO0Oo;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f123302OooOo0o.cancel();
        }
    }

    /* JADX INFO: renamed from: oOO00O0o.OooO0OO$OooO0oO, reason: case insensitive filesystem */
    public class DialogInterfaceOnClickListenerC34348OooO0oO implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC34349OooO0Oo f123303OooOo0o;

        public DialogInterfaceOnClickListenerC34348OooO0oO(InterfaceC34349OooO0Oo interfaceC34349OooO0Oo) {
            this.f123303OooOo0o = interfaceC34349OooO0Oo;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f123303OooOo0o.cancel();
        }
    }

    @Override // oOO00O0o.InterfaceC34350OooO0o0
    public final void OooO00o(int i, InterfaceC34349OooO0Oo interfaceC34349OooO0Oo) {
        MainActivity mainActivity = this.f123296OooO00o;
        if (i == 0) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(mainActivity).create();
            alertDialogCreate.setTitle("Package not found");
            alertDialogCreate.setMessage(interfaceC34349OooO0Oo.getPackageName().concat(" package was not found! Try to install it?"));
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.setButton(-1, "Yes", new OooO0Oo(interfaceC34349OooO0Oo));
            alertDialogCreate.setButton(-2, "No", new DialogInterfaceOnClickListenerC34347OooO0o0(interfaceC34349OooO0Oo));
            alertDialogCreate.show();
            return;
        }
        if (i != 1) {
            return;
        }
        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(mainActivity).create();
        alertDialogCreate2.setTitle("OpenCV is not ready");
        alertDialogCreate2.setMessage("Installation is in progress. Wait or exit?");
        alertDialogCreate2.setCancelable(false);
        alertDialogCreate2.setButton(-1, "Wait", new OooO0o(interfaceC34349OooO0Oo));
        alertDialogCreate2.setButton(-2, "Exit", new DialogInterfaceOnClickListenerC34348OooO0oO(interfaceC34349OooO0Oo));
        alertDialogCreate2.show();
    }

    @Override // oOO00O0o.InterfaceC34350OooO0o0
    public void OooO0O0(int i) {
        if (i != 0) {
            MainActivity mainActivity = this.f123296OooO00o;
            if (i == 2) {
                Log.e("OCV/BaseLoaderCallback", "Package installation failed!");
                AlertDialog alertDialogCreate = new AlertDialog.Builder(mainActivity).create();
                alertDialogCreate.setTitle("OpenCV Manager");
                alertDialogCreate.setMessage("Package installation failed!");
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.setButton(-1, "OK", new OooO00o());
                alertDialogCreate.show();
                return;
            }
            if (i == 3) {
                Log.d("OCV/BaseLoaderCallback", "OpenCV library installation was canceled by user");
                this.f123296OooO00o.finish();
                return;
            }
            if (i != 4) {
                Log.e("OCV/BaseLoaderCallback", "OpenCV loading failed!");
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(mainActivity).create();
                alertDialogCreate2.setTitle("OpenCV error");
                alertDialogCreate2.setMessage("OpenCV was not initialised correctly. Application will be shut down");
                alertDialogCreate2.setCancelable(false);
                alertDialogCreate2.setButton(-1, "OK", new DialogInterfaceOnClickListenerC20354OooO0OO());
                alertDialogCreate2.show();
                return;
            }
            Log.d("OCV/BaseLoaderCallback", "OpenCV Manager Service is uncompatible with this app!");
            AlertDialog alertDialogCreate3 = new AlertDialog.Builder(mainActivity).create();
            alertDialogCreate3.setTitle("OpenCV Manager");
            alertDialogCreate3.setMessage("OpenCV Manager service is incompatible with this app. Try to update it via Google Play.");
            alertDialogCreate3.setCancelable(false);
            alertDialogCreate3.setButton(-1, "OK", new OooO0O0());
            alertDialogCreate3.show();
        }
    }
}
