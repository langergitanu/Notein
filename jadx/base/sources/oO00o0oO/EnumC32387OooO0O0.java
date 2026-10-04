package oO00o0oO;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import oO00o00o.InterfaceC32331OooO0OO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO00o0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32387OooO0O0 implements Callable<List<Object>>, InterfaceC32331OooO0OO<Object, List<Object>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ EnumC32387OooO0O0[] f116478OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32387OooO0O0 f116479OooOo0o;

    static {
        EnumC32387OooO0O0 enumC32387OooO0O0 = new EnumC32387OooO0O0("INSTANCE", 0);
        f116479OooOo0o = enumC32387OooO0O0;
        f116478OooOo = new EnumC32387OooO0O0[]{enumC32387OooO0O0};
    }

    public EnumC32387OooO0O0() {
        throw null;
    }

    public static EnumC32387OooO0O0 valueOf(String str) {
        return (EnumC32387OooO0O0) Enum.valueOf(EnumC32387OooO0O0.class, str);
    }

    public static EnumC32387OooO0O0[] values() {
        return (EnumC32387OooO0O0[]) f116478OooOo.clone();
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public final List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public final List<Object> call() throws Exception {
        return new ArrayList();
    }
}
