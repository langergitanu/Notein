package oO0OOOO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OOOO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC32949OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC32949OooOOOo f119045OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC32949OooOOOo f119046OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC32949OooOOOo[] f119047OooOoO0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC32949OooOOOo EF0;

    static {
        EnumC32949OooOOOo enumC32949OooOOOo = new EnumC32949OooOOOo("PRETTY", 0);
        EnumC32949OooOOOo enumC32949OooOOOo2 = new EnumC32949OooOOOo("DEBUG", 1);
        f119046OooOo0o = enumC32949OooOOOo2;
        EnumC32949OooOOOo enumC32949OooOOOo3 = new EnumC32949OooOOOo("NONE", 2);
        f119045OooOo = enumC32949OooOOOo3;
        f119047OooOoO0 = new EnumC32949OooOOOo[]{enumC32949OooOOOo, enumC32949OooOOOo2, enumC32949OooOOOo3};
    }

    public EnumC32949OooOOOo() {
        throw null;
    }

    public static EnumC32949OooOOOo valueOf(String str) {
        return (EnumC32949OooOOOo) Enum.valueOf(EnumC32949OooOOOo.class, str);
    }

    public static EnumC32949OooOOOo[] values() {
        return (EnumC32949OooOOOo[]) f119047OooOoO0.clone();
    }
}
