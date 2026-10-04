package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.InterfaceC21986OooOoOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {
    private final Runnable mOnInvalidateMenuCallback;
    private final CopyOnWriteArrayList<MenuProvider> mMenuProviders = new CopyOnWriteArrayList<>();
    private final Map<MenuProvider, LifecycleContainer> mProviderToLifecycleContainers = new HashMap();

    public static class LifecycleContainer {
        final AbstractC21979OooOOo0 mLifecycle;
        private InterfaceC21986OooOoOO mObserver;

        public LifecycleContainer(AbstractC21979OooOOo0 abstractC21979OooOOo0, InterfaceC21986OooOoOO interfaceC21986OooOoOO) {
            this.mLifecycle = abstractC21979OooOOo0;
            this.mObserver = interfaceC21986OooOoOO;
            abstractC21979OooOOo0.OooO00o(interfaceC21986OooOoOO);
        }

        public void clearObservers() {
            this.mLifecycle.OooO0OO(this.mObserver);
            this.mObserver = null;
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.mOnInvalidateMenuCallback = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMenuProvider$0(MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$addMenuProvider$1(AbstractC21979OooOOo0.OooO0O0 oooO0O0, MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        AbstractC21979OooOOo0.OooO00o.Companion.getClass();
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.C19028OooO00o.OooO0O0(oooO0O0)) {
            addMenuProvider(menuProvider);
            return;
        }
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
            removeMenuProvider(menuProvider);
        } else if (oooO00o == AbstractC21979OooOOo0.OooO00o.C19028OooO00o.OooO00o(oooO0O0)) {
            this.mMenuProviders.remove(menuProvider);
            this.mOnInvalidateMenuCallback.run();
        }
    }

    public void addMenuProvider(MenuProvider menuProvider) {
        this.mMenuProviders.add(menuProvider);
        this.mOnInvalidateMenuCallback.run();
    }

    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public void onMenuClosed(Menu menu) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
    }

    public boolean onMenuItemSelected(MenuItem menuItem) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onPrepareMenu(Menu menu) {
        Iterator<MenuProvider> it = this.mMenuProviders.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
    }

    public void removeMenuProvider(MenuProvider menuProvider) {
        this.mMenuProviders.remove(menuProvider);
        LifecycleContainer lifecycleContainerRemove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainerRemove != null) {
            lifecycleContainerRemove.clearObservers();
        }
        this.mOnInvalidateMenuCallback.run();
    }

    public void addMenuProvider(final MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo) {
        addMenuProvider(menuProvider);
        AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOoo.getLifecycle();
        LifecycleContainer lifecycleContainerRemove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainerRemove != null) {
            lifecycleContainerRemove.clearObservers();
        }
        this.mProviderToLifecycleContainers.put(menuProvider, new LifecycleContainer(lifecycle, new InterfaceC21986OooOoOO() { // from class: androidx.core.view.OooOo0o
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo2, AbstractC21979OooOOo0.OooO00o oooO00o) {
                this.f64285OooOo0o.lambda$addMenuProvider$0(menuProvider, interfaceC21987OooOoo2, oooO00o);
            }
        }));
    }

    public void addMenuProvider(final MenuProvider menuProvider, InterfaceC21987OooOoo interfaceC21987OooOoo, final AbstractC21979OooOOo0.OooO0O0 oooO0O0) {
        AbstractC21979OooOOo0 lifecycle = interfaceC21987OooOoo.getLifecycle();
        LifecycleContainer lifecycleContainerRemove = this.mProviderToLifecycleContainers.remove(menuProvider);
        if (lifecycleContainerRemove != null) {
            lifecycleContainerRemove.clearObservers();
        }
        this.mProviderToLifecycleContainers.put(menuProvider, new LifecycleContainer(lifecycle, new InterfaceC21986OooOoOO() { // from class: androidx.core.view.OooOo0O
            @Override // androidx.lifecycle.InterfaceC21986OooOoOO
            public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo2, AbstractC21979OooOOo0.OooO00o oooO00o) {
                this.f64282OooOo0o.lambda$addMenuProvider$1(oooO0O0, menuProvider, interfaceC21987OooOoo2, oooO00o);
            }
        }));
    }
}
