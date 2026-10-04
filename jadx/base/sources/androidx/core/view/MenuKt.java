package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hihonor.honorid.core.data.ChildrenInfo;
import java.util.Iterator;
import kotlin.Metadata;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a(\u0010\u0012\u001a\u00020\n*\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a.\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\"\u0016\u0010\u001e\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m80612d2 = {"Landroid/view/Menu;", "", FirebaseAnalytics.Param.INDEX, "Landroid/view/MenuItem;", "get", "(Landroid/view/Menu;I)Landroid/view/MenuItem;", "item", "", "contains", "(Landroid/view/Menu;Landroid/view/MenuItem;)Z", "LoO00ooO/OooOooO;", "minusAssign", "(Landroid/view/Menu;Landroid/view/MenuItem;)V", "isEmpty", "(Landroid/view/Menu;)Z", "isNotEmpty", "Lkotlin/Function1;", "action", "forEach", "(Landroid/view/Menu;LoO0O000o/OooOO0o;)V", "Lkotlin/Function2;", "forEachIndexed", "(Landroid/view/Menu;LoO0O000o/OooOOOo;)V", "", "iterator", "(Landroid/view/Menu;)Ljava/util/Iterator;", "removeItemAt", "(Landroid/view/Menu;I)V", "getSize", "(Landroid/view/Menu;)I", "size", "LoO0o0O0O/OooO0oo;", "getChildren", "(Landroid/view/Menu;)LoO0o0O0O/OooO0oo;", ChildrenInfo.TAG_CHILDREN_INFO, "core-ktx_release"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class MenuKt {

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1 */
    @Metadata(m80611d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "", "hasNext", "()Z", "next", "()Landroid/view/MenuItem;", "LoO00ooO/OooOooO;", "remove", "()V", "", FirebaseAnalytics.Param.INDEX, "I", "core-ktx_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class C00611 implements Iterator<MenuItem>, oO0O00.OooO00o {
        final /* synthetic */ Menu $this_iterator;
        private int index;

        public C00611(Menu menu) {
            this.$this_iterator = menu;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            C32460OooOooO c32460OooOooO;
            Menu menu = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                menu.removeItem(item.getItemId());
                c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } else {
                c32460OooOooO = null;
            }
            if (c32460OooOooO == null) {
                throw new IndexOutOfBoundsException();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public MenuItem next() {
            Menu menu = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, InterfaceC32507OooOO0o<? super MenuItem, C32460OooOooO> interfaceC32507OooOO0o) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            interfaceC32507OooOO0o.invoke(menu.getItem(i));
        }
    }

    public static final void forEachIndexed(Menu menu, InterfaceC32508OooOOOo<? super Integer, ? super MenuItem, C32460OooOooO> interfaceC32508OooOOOo) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            interfaceC32508OooOOOo.invoke(Integer.valueOf(i), menu.getItem(i));
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        return menu.getItem(i);
    }

    public static final InterfaceC33569OooO0oo<MenuItem> getChildren(final Menu menu) {
        return new InterfaceC33569OooO0oo<MenuItem>() { // from class: androidx.core.view.MenuKt$children$1
            @Override // oO0o0O0O.InterfaceC33569OooO0oo
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(Menu menu) {
        return new C00611(menu);
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i) {
        C32460OooOooO c32460OooOooO;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } else {
            c32460OooOooO = null;
        }
        if (c32460OooOooO == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
