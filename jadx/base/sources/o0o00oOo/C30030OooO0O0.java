package o0o00oOo;

import android.content.Context;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0o00oOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30030OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f106746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32508OooOOOo<String, Integer, C32460OooOooO> f106747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public PopupWindow f106748OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public RecyclerView f106749OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f106750OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0o0O000.OooO0OO f106751OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f106752OooO0oO = Oooo0.o000000O.OooO0o(180);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f106753OooO0oo = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    public C30030OooO0O0(Context context, InterfaceC32508OooOOOo<? super String, ? super Integer, C32460OooOooO> interfaceC32508OooOOOo) {
        this.f106746OooO00o = context;
        this.f106747OooO0O0 = interfaceC32508OooOOOo;
    }

    public final void OooO00o(ArrayList arrayList) {
        o0o0O000.OooO0OO oooO0OO = this.f106751OooO0o0;
        if (oooO0OO != null) {
            oooO0OO.OooO0Oo(arrayList);
        }
    }
}
