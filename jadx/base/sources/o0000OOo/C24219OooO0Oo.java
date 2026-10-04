package o0000OOo;

import kotlin.jvm.internal.OooOOO0;
import o0000OO.OooOO0O;

/* JADX INFO: renamed from: o0000OOo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C24219OooO0Oo extends OooOO0O {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f81451OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f81452OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24219OooO0Oo(String type, String str) {
        super(type, str);
        OooOOO0.OooO0oO(type, "type");
        this.f81452OooOo = type;
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // o0000OO.OooOO0O
    public final String OooO00o() {
        return this.f81452OooOo;
    }
}
