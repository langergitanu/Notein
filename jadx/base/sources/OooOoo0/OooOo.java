package OooOoo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Boolean> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20676Oooo00O f59290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O<Boolean> f59291OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(Oooo0oO.o00oO0O o00oo0o, C20676Oooo00O c20676Oooo00O) {
        super(0);
        this.f59291OooOo0o = o00oo0o;
        this.f59290OooOo = c20676Oooo00O;
    }

    @Override // oO0O000o.OooO00o
    public final Boolean invoke() {
        return Boolean.valueOf(this.f59291OooOo0o.getValue().booleanValue() || ((Boolean) this.f59290OooOo.invoke()).booleanValue());
    }
}
