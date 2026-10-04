package oO0OOo;

import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends C33033OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AbstractC33320OooOoo f119494OooO0OO;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32615OooOoo, AbstractC33320OooOoo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ AbstractC33320OooOoo f119495OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC33320OooOoo abstractC33320OooOoo) {
            super(1);
            this.f119495OooOo0o = abstractC33320OooOoo;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final AbstractC33320OooOoo invoke(InterfaceC32615OooOoo interfaceC32615OooOoo) {
            InterfaceC32615OooOoo it = interfaceC32615OooOoo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return this.f119495OooOo0o;
        }
    }

    public OooOo(List<? extends AbstractC33038OooO0oO<?>> list, AbstractC33320OooOoo abstractC33320OooOoo) {
        super(list, new OooO00o(abstractC33320OooOoo));
        this.f119494OooO0OO = abstractC33320OooOoo;
    }
}
