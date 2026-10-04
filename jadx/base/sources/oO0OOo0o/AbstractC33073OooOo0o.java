package oO0OOo0o;

import com.google.common.base.MoreObjects;
import oO0OOo0o.AbstractC33081Oooo;

/* JADX INFO: renamed from: oO0OOo0o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33073OooOo0o<T extends AbstractC33081Oooo<T>> extends AbstractC33081Oooo<T> {
    @Override // oO0OOo0o.AbstractC33081Oooo
    public AbstractC33093Oooo0oo OooO00o() {
        return OooO0o0().OooO00o();
    }

    public abstract AbstractC33081Oooo<?> OooO0o0();

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", OooO0o0()).toString();
    }
}
