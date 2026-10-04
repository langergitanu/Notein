package o0oo0oo;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import o0oo0ooo.C31413OooO0O0;

/* JADX INFO: renamed from: o0oo0oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31389OooOoOO extends C31400Oooo0o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f112083OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f112084OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f112085OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public short f112086OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public byte[] f112087OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f112088OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f112089OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f112090OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f112091OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f112092OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f112093OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f112094OooOOo0;

    @Override // o0oo0oo.C31400Oooo0o0
    public final void OooO00o(C31401Oooo0oO c31401Oooo0oO, AbstractC31397Oooo0O0 abstractC31397Oooo0O0) throws IOException {
        this.f112084OooO0o = abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.Oooo000();
        this.f112085OooO0oO = abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        this.f112086OooO0oo = abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        abstractC31397Oooo0O0.Oooo000();
        this.f112083OooO = abstractC31397Oooo0O0.Oooo000();
        this.f112087OooOO0 = abstractC31397Oooo0O0.OooOOo0(10);
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo0OO();
        abstractC31397Oooo0O0.Oooo00o(4, C31413OooO0O0.f112169OooO00o);
        this.f112088OooOO0O = abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        abstractC31397Oooo0O0.ooOO();
        try {
            this.f112089OooOO0o = abstractC31397Oooo0O0.Oooo000();
            this.f112091OooOOO0 = abstractC31397Oooo0O0.Oooo000();
            abstractC31397Oooo0O0.Oooo000();
            abstractC31397Oooo0O0.ooOO();
            abstractC31397Oooo0O0.ooOO();
            if (this.f112084OooO0o >= 1) {
                try {
                    this.f112090OooOOO = abstractC31397Oooo0O0.Oooo0OO();
                    this.f112092OooOOOO = abstractC31397Oooo0O0.Oooo0OO();
                } catch (EOFException e) {
                    this.f112084OooO0o = 0;
                    Log.w("PdfBox-Android", "Could not read all expected parts of version >= 1, setting version to 0", e);
                    this.f112121OooO0Oo = true;
                    return;
                }
            }
            if (this.f112084OooO0o >= 2) {
                try {
                    this.f112093OooOOOo = abstractC31397Oooo0O0.Oooo000();
                    this.f112094OooOOo0 = abstractC31397Oooo0O0.Oooo000();
                    abstractC31397Oooo0O0.ooOO();
                    abstractC31397Oooo0O0.ooOO();
                    abstractC31397Oooo0O0.ooOO();
                } catch (EOFException e2) {
                    this.f112084OooO0o = 1;
                    Log.w("PdfBox-Android", "Could not read all expected parts of version >= 2, setting version to 1", e2);
                    this.f112121OooO0Oo = true;
                    return;
                }
            }
            this.f112121OooO0Oo = true;
        } catch (EOFException unused) {
            Log.d("PdfBox-Android", "EOF, probably some legacy TrueType font");
            this.f112121OooO0Oo = true;
        }
    }
}
