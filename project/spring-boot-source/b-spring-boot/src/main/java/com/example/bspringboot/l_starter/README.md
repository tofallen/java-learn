starter

@Conditional
    含义：基于条件的注解
    作用：根据是否满足某一个条件来决定是否创建特定bean
    意义：SpringBoot实现自动配置的关键

@ConditionalOnBean           存在bean时生效
@ConditionalOnMissingBean    不存在bean时生效
@ConditionalOnClass            class存在则生效
@ConditionalOnMissingClass     class不存在则生效
@ConditionalOnWebApplication   web环境生效
@ConditionalOnProperty         包含特定属性时生效
@ConditionalOnNotWebApplication  非web环境生效
@ConditionalOnJava                特定java版本生效     


starter介绍：
    简介：可插拔插件
    与jar包区别：starter能实现自动配置
    作用：大幅提升开发效率


