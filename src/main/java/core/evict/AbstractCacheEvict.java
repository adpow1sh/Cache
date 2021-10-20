package core.evict;

import api.cache.ICacheEntry;
import api.evict.ICacheEvict;
import api.evict.ICacheEvictContext;

public abstract class AbstractCacheEvict<K,V> implements ICacheEvict<K,V> {

    @Override
    public ICacheEntry<K, V> evict(ICacheEvictContext<K, V> context) {
        //返回结果
        return doEvict(context);
    }

    /**
     * 执行移除
     * @param context
     * @return
     */
    protected abstract ICacheEntry<K,V> doEvict(ICacheEvictContext<K,V> context);

    @Override
    public void updateKey(K key) {

    }

    @Override
    public void removeKey(K key) {

    }
}
