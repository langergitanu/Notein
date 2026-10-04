package o0OoO0oo;

import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31044OooOOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32511OooOOoo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.ImageViewModel$latestImages$1", m80623f = "ImageViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28697OooOOO0 extends AbstractC32476OooO implements InterfaceC32511OooOOoo<Boolean, Set<? extends Uri>, Boolean, Map<String, ? extends Uri>, Continuation<? super List<? extends C31044OooOOOo>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Set f101686OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f101687OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Map f101688OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ boolean f101689OooOoO0;

    @Override // oO0O000o.InterfaceC32511OooOOoo
    public final Object Oooo0oO(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        C28697OooOOO0 c28697OooOOO0 = new C28697OooOOO0(5, (Continuation) serializable);
        c28697OooOOO0.f101687OooOo0o = zBooleanValue;
        c28697OooOOO0.f101686OooOo = (Set) obj2;
        c28697OooOOO0.f101689OooOoO0 = zBooleanValue2;
        c28697OooOOO0.f101688OooOoO = (Map) obj4;
        return c28697OooOOO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean z = this.f101687OooOo0o;
        Set set = this.f101686OooOo;
        boolean z2 = this.f101689OooOoO0;
        Map map = this.f101688OooOoO;
        if (!z2) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) ((Map.Entry) it.next()).getValue();
            arrayList.add(new C31044OooOOOo(uri, set.contains(uri), z));
        }
        return arrayList;
    }
}
