import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/MyHelloWorld'
import Index from '@/components/index'
import TaskList from '@/components/list/TaskList'
import CaseList from '@/components/list/CaseList'
import ReportList from '@/components/list/ReportList'

Vue.use(Router)

export default new Router({
	routes: [
//		{ 这是演示helloworld的代码
//			path: '/',
//			name: 'HelloWorld',
//			component: HelloWorld
//		},
		{
			path: '/',
			name: 'Index',
			component: Index
		},
		{
			path: '/TaskList',
			name: 'TaskList',
			component: TaskList
		},
		{
			path: '/CaseList',
			name: 'CaseList',
			component: CaseList
		},
		{
			path: '/ReportList',
			name: 'ReportList',
			component: ReportList
		}
	]
})