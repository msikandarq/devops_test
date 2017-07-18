package org.jenkinsci.plugins.customplugin;

import hudson.Extension;
import hudson.views.ViewsTabBar;
import hudson.views.ViewsTabBarDescriptor;
import net.sf.json.JSONObject;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;


public class CustomViewsTabBar extends ViewsTabBar {
   
    @DataBoundConstructor
    public CustomViewsTabBar() {
        super();
    }
    
    @Extension
    public static final class CustomViewsTabBarDescriptor extends ViewsTabBarDescriptor {

        public CustomViewsTabBarDescriptor() {
            load();
        }

        @Override
        public String getDisplayName() {
            return "Custom Views TabBar";
        }

        @Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            save();
            return false;
        }
    }
}