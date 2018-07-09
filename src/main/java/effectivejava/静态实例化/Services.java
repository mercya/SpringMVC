package effectivejava.静态实例化;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by eCRF on 2018/5/30.
 */
public class Services {
    private Services(){}//阻止初始化？？？

    private static final Map<String,Provider> provider=new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER_NAME="<def>";
    public static void registerDefaultProvider(Provider p){
        registerProvider(p,DEFAULT_PROVIDER_NAME);
    }
    public static void registerProvider(Provider p,String name){
        provider.put(name,p);
    }
    public static Service newInstance()
    {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }
    public static Service newInstance(String name)
    {
        Provider p=provider.get(name);
        if (p==null){
            throw new  IllegalArgumentException("No provider registered with :"+name);
        }
        return p.newService();
    }

}
