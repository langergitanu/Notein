package OoooOOO;

import Oooo0.C20888o000Ooo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOOO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OoooOOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21177OooO00o extends OooOOOO implements InterfaceC32508OooOOOo<InterfaceC21186OooOO0O, Object, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C20888o000Ooo.OooO00o f61421OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21177OooO00o(C20888o000Ooo.OooO00o oooO00o) {
        super(2);
        this.f61421OooOo0o = oooO00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC21186OooOO0O interfaceC21186OooOO0O, Object obj) {
        InterfaceC21186OooOO0O interfaceC21186OooOO0O2 = interfaceC21186OooOO0O;
        List<? extends Object> listInvoke = this.f61421OooOo0o.invoke(interfaceC21186OooOO0O2, obj);
        int size = listInvoke.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = listInvoke.get(i);
            if (obj2 != null && !interfaceC21186OooOO0O2.OooO00o(obj2)) {
                throw new IllegalArgumentException("item can't be saved");
            }
        }
        List<? extends Object> list = listInvoke;
        if (list.isEmpty()) {
            return null;
        }
        return new ArrayList(list);
    }
}
