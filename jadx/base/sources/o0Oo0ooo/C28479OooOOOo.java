package o0Oo0ooo;

import androidx.lifecycle.AbstractC22019Ooooooo;
import kotlin.Metadata;
import o00o00O0.C25252OooO0Oo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;

/* JADX INFO: renamed from: o0Oo0ooo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lo0Oo0ooo/OooOOOo;", "Landroidx/lifecycle/Ooooooo;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C28479OooOOOo extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C33781o00o0O f100908OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C33769Ooooo0o f100909OooO0o0;

    public C28479OooOOOo() {
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(new C28478OooOOOO(0));
        this.f100908OooO0Oo = c33781o00o0OOooO00o;
        this.f100909OooO0o0 = C25252OooO0Oo.OooO0OO(c33781o00o0OOooO00o);
    }

    public final void OooO0o0(String raw) {
        C33781o00o0O c33781o00o0O;
        Object value;
        kotlin.jvm.internal.OooOOO0.OooO0oO(raw, "raw");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < raw.length(); i++) {
            char cCharAt = raw.charAt(i);
            if (!io.ktor.utils.p616io.Oooo000.OooO0o0(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String phoneNumber = sb.toString();
        do {
            c33781o00o0O = this.f100908OooO0Oo;
            value = c33781o00o0O.getValue();
            ((C28478OooOOOO) value).getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(phoneNumber, "phoneNumber");
        } while (!c33781o00o0O.OooO(value, new C28478OooOOOO(phoneNumber)));
    }
}
