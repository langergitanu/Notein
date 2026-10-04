package oO0O00o0;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, m80612d2 = {"LoO0O00o0/OooO00o;", "V", "LoO0O00o0/OooO0OO;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "LoOoo0/OooOO0o;", "property", "oldValue", "newValue", "", "beforeChange", "(LoOoo0/OooOO0o;Ljava/lang/Object;Ljava/lang/Object;)Z", "LoO00ooO/OooOooO;", "afterChange", "(LoOoo0/OooOO0o;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "getValue", "(Ljava/lang/Object;LoOoo0/OooOO0o;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;LoOoo0/OooOO0o;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "kotlin-stdlib"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class OooO00o<V> implements OooO0OO<Object, V> {
    private V value;

    public OooO00o(V v) {
        this.value = v;
    }

    public void afterChange(InterfaceC34602OooOO0o<?> property, V oldValue, V newValue) {
        OooOOO0.OooO0oO(property, "property");
    }

    public boolean beforeChange(InterfaceC34602OooOO0o<?> property, V oldValue, V newValue) {
        OooOOO0.OooO0oO(property, "property");
        return true;
    }

    @Override // oO0O00o0.OooO0O0
    public V getValue(Object thisRef, InterfaceC34602OooOO0o<?> property) {
        OooOOO0.OooO0oO(property, "property");
        return this.value;
    }

    @Override // oO0O00o0.OooO0OO
    public void setValue(Object thisRef, InterfaceC34602OooOO0o<?> property, V value) {
        OooOOO0.OooO0oO(property, "property");
        V v = this.value;
        if (beforeChange(property, v, value)) {
            this.value = value;
            afterChange(property, v, value);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
