package o000o0O0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24030OooOoo;
import kotlin.jvm.internal.C24033OooOooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o000o0O0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24579OooOOo0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooOO0, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f83262OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C24030OooOoo f83263OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24572OooOO0o f83264OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f83265OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Bundle f83266OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24579OooOOo0(C24030OooOoo c24030OooOoo, ArrayList arrayList, C24033OooOooo c24033OooOooo, C24572OooOO0o c24572OooOO0o, Bundle bundle) {
        super(1);
        this.f83263OooOo0o = c24030OooOoo;
        this.f83262OooOo = arrayList;
        this.f83265OooOoO0 = c24033OooOooo;
        this.f83264OooOoO = c24572OooOO0o;
        this.f83266OooOoOO = bundle;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(OooOO0 oooOO02) {
        List<OooOO0> listSubList;
        OooOO0 entry = oooOO02;
        kotlin.jvm.internal.OooOOO0.OooO0oO(entry, "entry");
        this.f83263OooOo0o.f80938OooOo0o = true;
        ArrayList arrayList = this.f83262OooOo;
        int iIndexOf = arrayList.indexOf(entry);
        if (iIndexOf != -1) {
            C24033OooOooo c24033OooOooo = this.f83265OooOoO0;
            int i = iIndexOf + 1;
            listSubList = arrayList.subList(c24033OooOooo.f80940OooOo0o, i);
            c24033OooOooo.f80940OooOo0o = i;
        } else {
            listSubList = C34434OooOoO.f123453OooOo0o;
        }
        this.f83264OooOoO.OooO00o(entry.f83189OooOo, this.f83266OooOoOO, entry, listSubList);
        return C32460OooOooO.f116667OooO00o;
    }
}
