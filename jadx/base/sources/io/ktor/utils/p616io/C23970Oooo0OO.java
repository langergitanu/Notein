package io.ktor.utils.p616io;

import kotlin.jvm.internal.OooOOOO;
import oO0O000o.OooO00o;

/* JADX INFO: renamed from: io.ktor.utils.io.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23970Oooo0OO extends OooOOOO implements OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f80703OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC23985Ooooo00 f80704OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23970Oooo0OO(AbstractC23985Ooooo00 abstractC23985Ooooo00, int i) {
        super(0);
        this.f80704OooOo0o = abstractC23985Ooooo00;
        this.f80703OooOo = i;
    }

    @Override // oO0O000o.OooO00o
    public final Boolean invoke() {
        AbstractC23985Ooooo00 abstractC23985Ooooo00 = this.f80704OooOo0o;
        return Boolean.valueOf(abstractC23985Ooooo00.OooO0OO() < this.f80703OooOo && !abstractC23985Ooooo00.OooOoo());
    }
}
