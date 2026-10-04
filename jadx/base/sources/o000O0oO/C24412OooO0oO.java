package o000O0oO;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.ink.authoring.InProgressStrokesView;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.o000oOoO;
import o000Oo00.InterfaceC24514OooO00o;
import o000Oo0O.C24531OooOo0o;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000O0oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24412OooO0oO implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82421OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82422OooOo0o;

    public /* synthetic */ C24412OooO0oO(Object obj, int i) {
        this.f82422OooOo0o = i;
        this.f82421OooOo = obj;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        Object obj = this.f82421OooOo;
        switch (this.f82422OooOo0o) {
            case 0:
                int i = InProgressStrokesView.f65171OooOoO;
                int i2 = InterfaceC24514OooO00o.f82908OooO00o;
                o000oOoO textureStore = ((InProgressStrokesView) obj).textureBitmapStore;
                OooOOO0.OooO0oO(textureStore, "textureStore");
                return new C24531OooOo0o(textureStore, false);
            case 1:
                ((androidx.room.OooO0OO) obj).getClass();
                return C32460OooOooO.f116667OooO00o;
            default:
                return ViewConfiguration.get((Context) obj);
        }
    }
}
