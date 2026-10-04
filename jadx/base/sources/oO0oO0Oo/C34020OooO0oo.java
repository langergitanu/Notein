package oO0oO0Oo;

/* JADX INFO: renamed from: oO0oO0Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34020OooO0oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final InterfaceC34019OooO0oO[] f122324OooO0Oo = new InterfaceC34019OooO0oO[0];

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC34019OooO0oO[] f122325OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122326OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f122327OooO0OO;

    public C34020OooO0oo() {
        this(10);
    }

    public final void OooO00o(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122325OooO00o;
        int length = interfaceC34019OooO0oOArr.length;
        int i = this.f122326OooO0O0 + 1;
        if (this.f122327OooO0OO | (i > length)) {
            InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr2 = new InterfaceC34019OooO0oO[Math.max(interfaceC34019OooO0oOArr.length, (i >> 1) + i)];
            System.arraycopy(this.f122325OooO00o, 0, interfaceC34019OooO0oOArr2, 0, this.f122326OooO0O0);
            this.f122325OooO00o = interfaceC34019OooO0oOArr2;
            this.f122327OooO0OO = false;
        }
        this.f122325OooO00o[this.f122326OooO0O0] = interfaceC34019OooO0oO;
        this.f122326OooO0O0 = i;
    }

    public final InterfaceC34019OooO0oO OooO0O0(int i) {
        if (i < this.f122326OooO0O0) {
            return this.f122325OooO00o[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.f122326OooO0O0);
    }

    public final InterfaceC34019OooO0oO[] OooO0OO() {
        int i = this.f122326OooO0O0;
        if (i == 0) {
            return f122324OooO0Oo;
        }
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122325OooO00o;
        if (interfaceC34019OooO0oOArr.length == i) {
            this.f122327OooO0OO = true;
            return interfaceC34019OooO0oOArr;
        }
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr2 = new InterfaceC34019OooO0oO[i];
        System.arraycopy(interfaceC34019OooO0oOArr, 0, interfaceC34019OooO0oOArr2, 0, i);
        return interfaceC34019OooO0oOArr2;
    }

    public C34020OooO0oo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.f122325OooO00o = i == 0 ? f122324OooO0Oo : new InterfaceC34019OooO0oO[i];
        this.f122326OooO0O0 = 0;
        this.f122327OooO0OO = false;
    }
}
