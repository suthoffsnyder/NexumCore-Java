# NexumCore-Java

NexumCore-Java 是基于 Java 构建的高性能模块化公链底层核心项目，集成分布式账本、共识机制、P2P网络、加密算法、智能合约、跨链交互、节点治理等全栈公链能力，支持多语言扩展、高并发交易处理、去中心化身份认证与链上数据确权，为企业级与社区化公链提供安全、稳定、可扩展的底层架构。

## 项目特性
- 基于 Java 构建，高性能、高扩展
- 支持 DPoS 共识机制
- 原生 P2P 去中心化网络
- 链上智能合约引擎与存储
- 跨链中继与验证
- 钱包、地址、签名标准化
- 区块挖矿、交易池、状态数据库
- 节点治理与链上投票
- 开放 API / RPC 接口
- 监控、统计、同步服务

## 文件清单与功能
- NexumBlockchainApplication.java：项目启动入口
- Block.java：区块实体结构
- Transaction.java：交易实体结构
- BlockchainEngine.java：区块链核心引擎
- ConsensusMechanism.java：共识接口
- DPoSConsensus.java：DPoS 共识实现
- P2PNodeServer.java：P2P 节点服务
- P2PMessageHandler.java：P2P 消息处理器
- CryptoUtil.java：通用加密工具
- WalletManager.java：钱包管理
- KeyPairUtil.java：密钥对生成工具
- TransactionValidator.java：交易校验器
- NodeManager.java：节点管理
- ChainSyncService.java：链数据同步服务
- SmartContractEngine.java：智能合约引擎
- ContractStorage.java：合约存储
- TokenContract.java：通证合约
- CrossChainService.java：跨链服务
- ChainConfig.java：链配置
- BlockMiner.java：区块挖矿器
- TransactionPool.java：交易池
- BlockStorage.java：区块持久化
- StateDatabase.java：账户状态库
- NodeHealthCheck.java：节点健康检查
- TransactionMonitor.java：交易监控
- GenesisBlockCreator.java：创世块生成
- DifficultyAdjustor.java：难度调整
- SignatureUtil.java：签名工具
- AddressGenerator.java：地址生成器
- NetworkRouter.java：P2P 路由广播
- ContractExecutor.java：合约执行器
- RewardCalculator.java：出块奖励计算
- GovernanceVote.java：链上治理投票
- ChainStatistics.java：链数据统计
- ApiServerController.java：REST API 接口
- NodeRpcServer.java：RPC 服务
- MerkleTreeUtil.java：默克尔树根计算
- NexumConstants.java：系统常量

## 技术架构
- 语言：Java
- 网络：Netty P2P
- 加密：SHA256 / secp256k1
- 共识：DPoS
- 存储：内存式 + 可扩展持久化
- 接口：Spring Boot API / RPC

## 使用说明
本项目为公链底层核心，可直接部署节点、接入网络、发起交易、部署智能合约。

## 适用场景
- 公链底层开发
- 联盟链 / 私有链定制
- 数字资产发行
- 去中心化应用底层支撑
- 跨链生态对接
