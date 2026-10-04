package o00O00o;

import Oooo0oO.o0Oo0oo;
import Oooo0oo.AbstractC21138OooO0oo;
import android.util.Log;
import com.facebook.soloader.OooOo;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<T> extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f84139OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f84140OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f84141OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24806OooO00o f84142OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f84143OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final EnumC24811OooO0oo f84144OooO0o0;

    public OooO0o(T value, String tag, String str, C24806OooO00o logger, EnumC24811OooO0oo verificationMode) {
        Collection collectionOooO0oO;
        OooOOO0.OooO0oO(value, "value");
        OooOOO0.OooO0oO(tag, "tag");
        OooOOO0.OooO0oO(logger, "logger");
        OooOOO0.OooO0oO(verificationMode, "verificationMode");
        this.f84139OooO00o = value;
        this.f84140OooO0O0 = tag;
        this.f84141OooO0OO = str;
        this.f84142OooO0Oo = logger;
        this.f84144OooO0o0 = verificationMode;
        String message = AbstractC21138OooO0oo.Oooo0oo(value, str);
        OooOOO0.OooO0oO(message, "message");
        OooOO0 oooOO02 = new OooOO0(message);
        StackTraceElement[] stackTrace = oooOO02.getStackTrace();
        OooOOO0.OooO0o(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionOooO0oO = C34434OooOoO.f123453OooOo0o;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionOooO0oO = OooOOO.OoooOO0(stackTrace);
            } else if (length == 1) {
                collectionOooO0oO = OooOo.OooO0oO(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collectionOooO0oO = arrayList;
            }
        }
        oooOO02.setStackTrace((StackTraceElement[]) collectionOooO0oO.toArray(new StackTraceElement[0]));
        this.f84143OooO0o = oooOO02;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final T Oooo0o() throws OooOO0 {
        int iOrdinal = this.f84144OooO0o0.ordinal();
        if (iOrdinal == 0) {
            throw this.f84143OooO0o;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return null;
            }
            throw new C32442OooOO0o();
        }
        String message = AbstractC21138OooO0oo.Oooo0oo(this.f84139OooO00o, this.f84141OooO0OO);
        C24806OooO00o c24806OooO00o = this.f84142OooO0Oo;
        String tag = this.f84140OooO0O0;
        c24806OooO00o.getClass();
        OooOOO0.OooO0oO(tag, "tag");
        OooOOO0.OooO0oO(message, "message");
        Log.d(tag, message);
        return null;
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final AbstractC21138OooO0oo Oooooo0(String str, InterfaceC32507OooOO0o<? super T, Boolean> condition) {
        OooOOO0.OooO0oO(condition, "condition");
        return this;
    }
}
