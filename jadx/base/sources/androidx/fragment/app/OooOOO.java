package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.Collection;
import java.util.Map;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Map.Entry<String, View>, Boolean> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f64972OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(Collection<String> collection) {
        super(1);
        this.f64972OooOo0o = collection;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        kotlin.jvm.internal.OooOOO0.OooO0oO(entry2, "entry");
        return Boolean.valueOf(oOo000Oo.OooOo.Oooo00o(this.f64972OooOo0o, ViewCompat.getTransitionName(entry2.getValue())));
    }
}
