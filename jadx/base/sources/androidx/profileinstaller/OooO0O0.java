package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.OooO0OO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import o000oOoo.C24642OooO0O0;
import o000oOoo.C24647OooO0oO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f65734OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO.InterfaceC19032OooO0OO f65735OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f65736OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f65737OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f65738OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f65739OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C24642OooO0O0[] f65740OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte[] f65741OooO0oo;

    public OooO0O0(AssetManager assetManager, Executor executor, OooO0OO.InterfaceC19032OooO0OO interfaceC19032OooO0OO, String str, File file) {
        byte[] bArr;
        this.f65734OooO00o = executor;
        this.f65735OooO0O0 = interfaceC19032OooO0OO;
        this.f65739OooO0o0 = str;
        this.f65737OooO0Oo = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = C24647OooO0oO.f83483OooO0Oo;
                    break;
                case 27:
                    bArr = C24647OooO0oO.f83482OooO0OO;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C24647OooO0oO.f83481OooO0O0;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = C24647OooO0oO.f83480OooO00o;
        }
        this.f65736OooO0OO = bArr;
    }

    public final FileInputStream OooO00o(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f65735OooO0O0.OooO0O0();
            return null;
        }
    }

    public final void OooO0O0(final int i, Serializable serializable) {
        final Serializable serializable2 = serializable;
        this.f65734OooO00o.execute(new Runnable(i, serializable2) { // from class: o000oOoo.OooO00o

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ int f83463OooOo;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ Serializable f83465OooOoO0;

            {
                this.f83465OooOoO0 = serializable2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f83464OooOo0o.f65735OooO0O0.OooO00o(this.f83463OooOo, this.f83465OooOoO0);
            }
        });
    }
}
