package oO0oOOOo;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import oO00OoO0.InterfaceC32282OooO0O0;

/* JADX INFO: renamed from: oO0oOOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34121OooO00o implements InterfaceC32282OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AssetManager f122627OooO00o;

    public C34121OooO00o(AssetManager assetManager) {
        this.f122627OooO00o = assetManager;
    }

    @Override // oO00OoO0.InterfaceC32282OooO0O0
    public final InputStream OooO00o(String str) {
        try {
            return this.f122627OooO00o.open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }
}
