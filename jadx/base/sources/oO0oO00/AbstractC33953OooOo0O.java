package oO0oO00;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: oO0oO00.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33953OooOo0O<E, C extends Collection<? extends E>, B> extends AbstractC33951OooOo0<E, C, B> {
    @Override // oO0oO00.AbstractC33933OooO00o
    public final Iterator OooO0OO(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        return collection.iterator();
    }

    @Override // oO0oO00.AbstractC33933OooO00o
    public final int OooO0Oo(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(collection, "<this>");
        return collection.size();
    }
}
